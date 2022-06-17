const express = require("express");
const bodyparser = require("body-parser");
const path = require("path");

const app = express();

require("dotenv").config();
const port = process.env.port || 3000;

app.use(bodyparser.urlencoded({ extended: false }));
app.use(bodyparser.json());
app.set("views", path.join(__dirname, "src/views"));
app.use(express.static(path.join(__dirname, "public")));
app.use("/api/register", require("./private/db/register"));
app.use("/api/login", require("./private/db/login"));
app.use("/api/checkToken", require("./private/db/checkToken"));
app.set("view engine", "hbs");

const register = require("./src/routes/register");
const login = require("./src/routes/login");
const home = require("./src/routes/home");

app.get("/", (req, res) => {
  res.render("index.hbs", { titulo: "Bienvenidos" });
});

app.use("/users/register", register);
app.use("/users/login", login);
app.use("/users/home", home);

app.listen(port, () => {
  console.log("El servidor de encuentra en : " + port);
});
