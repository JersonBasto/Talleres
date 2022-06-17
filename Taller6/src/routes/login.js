const login = (req, res) => {
    res.render("login.hbs",{titulo:"Login"});
  };
  
  module.exports = login;