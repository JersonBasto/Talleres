const home = (req, res) => {
    res.render("home.hbs",{titulo:"Bienvenido"});
  };
  
  module.exports = home;