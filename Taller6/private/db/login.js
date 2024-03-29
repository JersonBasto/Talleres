/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * Se importa la funcion connectDB para realizar la conexion a la base de datos.
 * Se importa jsonwebtoken encargado de crear el token de login.
 * Se importa bcrypt encargado de Desencriptar la contraseña ingresada por el usuario.
 */
const connectDB = require("./db");
const jwt = require("jsonwebtoken");
const bcrypt = require("bcrypt");
/**
 * @param router Se encarga de realizar post a la base de datos.
 */
const router = require("express").Router();
router.post("/loginUser", async (req, res) => {
  let db;
  let user;
  let searchusername;
  let searchpassword;
  let Username;
  let Password;
  let token;
  try {
    user = req.body;
    Username = req.body.Username;
    Password = req.body.Password;
    db = await connectDB();

    searchusername = await db
      .collection("users")
      .findOne({ Username: Username });

    if (searchusername == null) {
      res.json({ mensaje: "El usuario no existe!", login: false });
    } else {
      searchpassword = await bcrypt.compare(
        req.body.Password,
        searchusername.Password
      );
      if (!searchpassword) {
        res.json({ mensaje: "Contraseña no valida!", login: false });
      } else {
        token = jwt.sign(
          {
            Name: searchusername.Name,
            Username: searchusername.Username,
          },
          process.env.TOKEN_SECRET,
          { expiresIn: "15m" }
        );
        res.json({
          mensaje: "Bienvenido " + searchusername.Name,
          token: token,
          login: true,
        });
      }
    }
  } catch (error) {
    console.log(error);
  }
});

module.exports = router;
