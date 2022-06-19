/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * @param {*} req 
 * @param {*} res Al momento en que el usuario hace click en login se hace llamado y renderiza el archivo login.hbs
 * con una variable titulo con un valor de login
 */
const login = (req, res) => {
    res.render("login.hbs",{titulo:"Login"});
  };
  
  module.exports = login;