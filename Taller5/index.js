const express = require("express");
const bodyparser = require("body-parser");

const app = express();

require("dotenv").config();
const port = process.env.port || 4000;

app.use(bodyparser.urlencoded({ extended: false }));
app.use(bodyparser.json());
//Import Routes
const cool = require("./src/routes/user");

app.get("/", (req, res) => {
  res.send("Hola Mundo");
});
app.use("/users/cool/", cool);

app.listen(port, () => {
  console.log("Servidor escuchado en " + port);
});
