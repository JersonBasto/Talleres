/**
 *  Se importan los paquetes necesarios para su funcionamineto
 *  @param express
 *  @param bodyparser
 *  @param path
 */
const express = require("express");
const bodyparser = require("body-parser");
const path = require("path");
/**
 *  Se crea la app con express
 */
const app = express();
/**
 * Se importa dotenv y ademas se configura el puerto
 * por el que va ejecutar la api
 */
require("dotenv").config();
const port = process.env.port || 4000;
/**
 *  Se hace uso del join para simplificar las rutas creadas
 * en las demas carpetas
 */
app.use(bodyparser.urlencoded({ extended: false }));
app.use(bodyparser.json());
app.set("views", path.join(__dirname, "views"));
app.set("view engine", "hbs");
app.use(express.static(path.join(__dirname, "public")));
app.use(express.static(path.join(__dirname, "src/routes")));
/**
 *  Se le asigna una ruta a /src/routes/user
 */
const cool = require("./src/routes/user");
/**
 * Se ingresa a http://localhost:4000/ y se renderiza
 * el archivo welcome.hbs que se encuentra en la carpeta views
 */
app.get("/", (req, res) => {
  res.render("welcome");
});
/**
 *  Se crea un ruta la cual tiene como objetivos mostrar lo que
 *  encuentra en l carpeta /src/routes/user
 */
app.use("/users/cool/", cool);
/**
 *  Desde aca se inicializa el servidor en el pouerto definido
 * anteriormente.
 * @param listen
 */
app.listen(port, () => {
  console.log("Servidor escuchado en " + port);
});
