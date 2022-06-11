/**
 *
 */
const express = require("express");
const bodyparser = require("body-parser");
const path = require("path");
/**
 *
 */
const app = express();
/**
 *
 */
require("dotenv").config();
const port = process.env.port || 4000;
/**
 *
 */
app.use(bodyparser.urlencoded({ extended: false }));
app.use(bodyparser.json());
app.set("views", path.join(__dirname, "views"));
app.set("view engine", "hbs");
app.use(express.static(path.join(__dirname, "public")));
app.use(express.static(path.join(__dirname, "src/routes")));
/**
 *
 */
const cool = require("./src/routes/user");
/**
 *
 */
app.get("/", (req, res) => {
  res.render("welcome");
});
/**
 *
 */
app.use("/users/cool/", cool);
/**
 *
 */
app.listen(port, () => {
  console.log("Servidor escuchado en " + port);
});
