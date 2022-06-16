const connectDB = require("./db");

const router = require("express").Router();
router.put("/registerUser", async (req, res) => {
  console.log("Recibe: ");
  console.log(req.body);
  let db;
  let user;
  let searchusername;
  let Name;
  let Surname;
  let Username;
  let Password;
  try {
    user = req.body;
    Name = req.body.Name;
    Surname = req.body.Surname;
    Username = req.body.Username;
    Password = req.body.Password;
    db = await connectDB();
    searchusername = await db
      .collection("users")
      .findOne({ Username: Username });
    if (searchusername == null) {
      usuario = await db.collection("users").insertOne(user);
      res.json({ mensaje: "Usuario Creado", create: true });
    } else {
      res.json({ mensaje: "Ya existe Usuario", create: false });
    }
  } catch (error) {
    console.log(error);
  }
});

module.exports = router;
