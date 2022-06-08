const express = require("express");
const bodyparser = require("body-parser");

const app = express();

require("dotenv").config();

//Configuracion del PORT
const port = process.env.port || 3000;

app.use(bodyparser.urlencoded({ extended: false }));
app.use(bodyparser.json());


app.listen(port, () => {
  console.log("El servidor de encuentra en : " + port);
});
