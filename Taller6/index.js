/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * @param express Libreria encargada de crear la api
 */
const express = require("express");
const bodyparser = require("body-parser");
const path = require("path");
/**
 * @param app se crea la app a partir de express
 */
const app = express();
/**
 * @param port se le asigna un puerto en este caso 3000.
 */
require("dotenv").config();
const port = process.env.port || 3000;
/**
 * Se colocan las direcciones a usar dentro de la api.
 */
app.use(bodyparser.urlencoded({ extended: false }));
app.use(bodyparser.json());
app.set("views", path.join(__dirname, "src/views"));
app.use(express.static(path.join(__dirname, "public")));
app.use("/api/register", require("./private/db/register"));
app.use("/api/login", require("./private/db/login"));
app.use("/api/checkToken", require("./private/db/checkToken"));
app.set("view engine", "hbs");

/**
 * Se le asigna una variable a las carpetas dentro del proyecto.
 */
const register = require("./src/routes/register");
const login = require("./src/routes/login");
const home = require("./src/routes/home");
/**
 * Se asigna la pagina index el cual es llamada en http://localhost:3000/
 */
app.get("/", (req, res) => {
  res.render("index.hbs", { titulo: "Bienvenidos" });
});
/**
 * Se asigna una direccion se acceso a las rutas dentro del proyecto.
 */
app.use("/users/register", register);
app.use("/users/login", login);
app.use("/users/home", home);
/**
 * Inicializa el servidor en el puerto 3000
 */
app.listen(port, () => {
  console.log("El servidor de encuentra en : " + port);
});
