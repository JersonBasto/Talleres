/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * @param {*} req 
 * @param {*} res al momento de hacer click en resgitrar se hace un llamado y renderizado del archivo
 * register.hbs con titulo como variable con un valor de Registro.
 */
const register = (req, res) => {
  res.render("register.hbs",{titulo:"Registro"});
};

module.exports = register;
