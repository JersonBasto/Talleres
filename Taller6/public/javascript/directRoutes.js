const btnRegisterRoute = document.getElementById("BtnRegister");

const BtnLoginRoute = document.getElementById("BtnLogin");
btnRegisterRoute.addEventListener("click", () => {
  window.location.replace("./users/register");
});
BtnLoginRoute.addEventListener("click", () => {
  window.location.replace("./users/login");
});
