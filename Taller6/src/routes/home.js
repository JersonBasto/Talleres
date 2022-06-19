/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * @param {*} req 
 * @param {*} res cuando inicia sesion el usuario se llama el archivo hbs para renderizar el cual se llama home.hbs y envia un titulo 
 * con el valor Bienvenido 
 */
const home = (req, res) => {
    res.render("home.hbs",{titulo:"Bienvenido"});
  };
  
  module.exports = home;