/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * @ButtonSend Capta los valores del buton Enviar, el cual es el encargado de enviar los datos a nuestro archivo que
 * valida estos datos en la base de datos. 
 */
const ButtonSend = document.getElementById("ButtonSend");

ButtonSend.addEventListener("click", () => {
  const Username = document.getElementById("Username").value;
  const Password = document.getElementById("Password").value;
  if (Username == "" || Username == null) {
    alert("Ingrese un Username.");
  } else if (Password == "" || Password == null || Password.length <= 6) {
    alert("Ingrese una contraseña con mas de 6 caracteres.");
  } else {
    let varJson = { Username, Password };
    enviarDatos(varJson);
    try {
    } catch (error) {}
  }
});
/**
 * 
 * @param {*} varJson Recoge una variable llamada varJson la cual contiene los datos escritos por el usuario
 * y los envia al archivo encargado de verificar la informacion del usuario y asi iniciar sesion.
 */
async function enviarDatos(varJson) {
  var response = await fetch("http://localhost:3000/api/login/loginUser", {
    method: "POST",
    mode: "cors",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(varJson),
  });
  if (response.ok) {
    var resJson = await response.json();
  }
  if (resJson.login) {
    alert(resJson.mensaje);
    localStorage.setItem("token", resJson.token);
    window.location.replace("./home");
  } else {
    alert(resJson.mensaje);
  }
}
