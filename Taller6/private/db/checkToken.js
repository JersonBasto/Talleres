/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * @param jwt Se importa la libreria jsonwebtoken encargado de generar un token para el acceso del usuario.
 */
const jwt = require("jsonwebtoken");
/**
 * @param router Se encarga de los metodos get,put,post,delete.
 */
const router = require("express").Router();
/**
 * Realiza una verificacion del token que se contiene dentro del localStorage y dependiendo de la validacion
 * da acceso o niega el acceso al usuario.
 */
router.post("/checkToken", async (req, res) => {
  let token = req.body.token;
  let Name;
  let Username;
  if (!token || token == "") {
    res.send({ mensaje: "No tiene acceso a la pagina", validate: false });
  } else {
    try {
      const verificar = jwt.verify(token, process.env.TOKEN_SECRET);
      Name = verificar.Name;
      Username = verificar.Username;
      res.send({
        Username,
        Name,
        mensaje: "Bienvenido al juego taller de Sofka",
        validate: true,
      });
    } catch (error) {
      console.log(error);
      res.send({ mensaje: "Ha expirado el Token", validate: false });
    }
  }
});
/**
 * Se exporta el modulo router
 */
module.exports = router;
