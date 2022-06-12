/**
 * @param ButtonRedirect
 * Se toma los datos del boton creado en welcome.hbs
 * 
 */

const ButtonRedirect = document.getElementById("ButtonRedirect");
/**
 * Y se crea un evento addEventListener donde se le asigna una 
 * funcion al momento de hacer click
 * @param addEventListener
 * 
 */
ButtonRedirect.addEventListener("click", () => {
  window.location.replace("./users/cool");
});
