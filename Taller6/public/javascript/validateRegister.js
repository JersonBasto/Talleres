/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * @param ButtonSend Capta los valores del boton Enviar y verifica los datos ingresados por el usuario para un
 * envio a la base datos.
 */
const ButtonSend = document.getElementById("ButtonSend");

ButtonSend.addEventListener("click", () => {
  const Name = document.getElementById("Name").value;
  const Surnames = document.getElementById("Surnames").value;
  const Username = document.getElementById("Username").value;
  const Password = document.getElementById("Password").value;
  if (Name == "" || Name == null) {
    alert("Debe ingresar un nombre.");
  } else if (Surnames == "" || Surnames == null) {
    alert("Debe ingresar apellidos validos.");
  } else if (Username == "" || Username == null) {
    alert("Ingrese un Username.");
  } else if (Password == "" || Password == null || Password.length <= 6) {
    alert("Ingrese una contraseña con mas de 6 caracteres.");
  } else {
    let varJson = { Name, Surnames, Username, Password };
    enviarDatos(varJson);
    try {
    } catch (error) {}
  }
});
/**
 * 
 * @param {*} varJson La variable varJson contiene los datos enviados por el usuario y los almacena dentro
 * de la base de datos.
 */
async function enviarDatos(varJson) {
  var response = await fetch(
    "http://localhost:3000/api/register/registerUser",
    {
      method: "PUT",
      mode: "cors",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(varJson),
    }
  )
  if(response.ok){
    var resJson = await response.json();
  }
  if(resJson.create){
    alert("Usuario creado");
    window.location.replace("./login");
  }
  else{
    alert("El username ya existe");
  }
}
