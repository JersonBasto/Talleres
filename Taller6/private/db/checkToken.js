const jwt = require("jsonwebtoken");
const router = require("express").Router();
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
module.exports = router;
