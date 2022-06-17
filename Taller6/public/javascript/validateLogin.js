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
