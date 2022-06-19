/**
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 * @btnRegisterRoute Capta los datos y valores del boton Registrar y redirecciona a la ventana
 * donde el usuario podra registrarse
 */
const btnRegisterRoute = document.getElementById("BtnRegister");
/**
 * @BtnLoginRoute Capta los datos y valores del boton login y redirecciona a la ventana
 * para que el usuario ahga login
 */
const BtnLoginRoute = document.getElementById("BtnLogin");
btnRegisterRoute.addEventListener("click", () => {
  window.location.replace("./users/register");
});
BtnLoginRoute.addEventListener("click", () => {
  window.location.replace("./users/login");
});
