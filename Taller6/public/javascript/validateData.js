async function checkToken() {
  let token = localStorage.getItem("token");
  let Bienvenido = document.getElementById("Bienvenido");
  var response = await fetch(
    "http://localhost:3000/api/checkToken/checkToken",
    {
      method: "POST",
      mode: "cors",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ token: token }),
    }
  );
  if (response.ok) {
    var resJson = await response.json();
  }
  if (resJson.validate) {
    alert(resJson.mensaje);
    Bienvenido.innerText = "  Bienvenido " + resJson.Username;
    Jugador1.placeholder = resJson.Username;
    Jugador1.value = resJson.Username;
  } else {
    alert(resJson.mensaje);
    window.location.replace("/");
  }
}
checkToken();

let playDados = document.getElementById("playDados");
let play = document.getElementById("play");
let Jugador1 = document.getElementById("Jugador1");
let player1;
let player2;
let player3;
let readyPlayer = false;
let selectPlayer1 = document.getElementById("selectPlayer1");
let selectPlayer2 = document.getElementById("selectPlayer2");
let selectPlayer3 = document.getElementById("selectPlayer3");
let select;
let playAgain = document.getElementById("playAgain");
let logout=document.getElementById("logout")

logout.addEventListener("click",()=>{
    localStorage.setItem('token',"")
    window.location.replace("/")
})

selectPlayer1.addEventListener("click", () => {
  if (readyPlayer) {
    if (Apuesta1.value == 0) {
      alert("El jugador " + player1.getUsername() + " no ha hecho una apuesta");
    } else {
      select = player1;
    }
  } else {
    alert("No ha iniciado el juego");
  }
});
selectPlayer2.addEventListener("click", () => {
  if (readyPlayer) {
    if (Apuesta2.value == 0) {
      alert("El jugador " + player2.getUsername() + " no ha hecho una apuesta");
    } else {
      select = player2;
    }
  } else {
    alert("No ha iniciado el juego");
  }
});
selectPlayer3.addEventListener("click", () => {
  if (readyPlayer) {
    if (Apuesta3.value == 0) {
      alert("El jugador " + player3.getUsername() + " no ha hecho una apuesta");
    } else {
      select = player3;
    }
  } else {
    alert("No ha iniciado el juego");
  }
});

play.addEventListener("click", () => {
  let Jugador1 = document.getElementById("Jugador1");
  let Jugador2 = document.getElementById("Jugador2");
  let Jugador3 = document.getElementById("Jugador3");
  let Apuesta1 = document.getElementById("Apuesta1");
  let Apuesta2 = document.getElementById("Apuesta2");
  let Apuesta3 = document.getElementById("Apuesta3");
  let apuestasPlayer1 = document.getElementById("apuestasPlayer1");
  let apuestasPlayer2 = document.getElementById("apuestasPlayer2");
  let apuestasPlayer3 = document.getElementById("apuestasPlayer3");
  let playAgain = document.getElementById("playAgain");
  if (Jugador1.value == "" || Jugador1.value == null) {
    alert("Debe escribir el nombre del jugador 1");
  } else if (Jugador2.value == "" || Jugador2.value == null) {
    alert("Debe escribir el nombre del jugador 2");
  } else if (Jugador3.value == "" || Jugador3.value == null) {
    alert("Debe escribir el nombre del jugador 3");
  } else {
    readyPlayer = true;
    player1 = new Jugador(Jugador1.value);
    player2 = new Jugador(Jugador2.value);
    player3 = new Jugador(Jugador3.value);
    Apuesta1.value = 0;
    Apuesta2.value = 0;
    Apuesta3.value = 0;
    apuestasPlayer1.innerText = player1.getUsername();
    apuestasPlayer2.innerText = player2.getUsername();
    apuestasPlayer3.innerText = player3.getUsername();
    obtenerDatos();
    play.style.visibility = "hidden";
    playAgain.style.visibility = "visible";
  }
});
playAgain.addEventListener("click", () => {
  let winner = false;
  winner = selectWinner();
  if (winner) {
    Apuesta1.value = 0;
    Apuesta2.value = 0;
    Apuesta3.value = 0;
    player1.setnumberOfPitches(0);
    player1.setPunctuation(0);
    player2.setnumberOfPitches(0);
    player2.setPunctuation(0);
    player3.setnumberOfPitches(0);
    player3.setPunctuation(0);
    obtenerDatos();
  } else {
    alert("Todavia no hay ganador!");
  }
});

playDados.addEventListener("click", () => {
  if (readyPlayer) {
    if (select == null) {
      alert("Seleccione quien lanza los dados");
    } else {
      let dado1 = document.getElementById("dado1");
      let dado2 = document.getElementById("dado2");
      var varDado1 = Math.floor(Math.random() * 6) + 1;
      var varDado2 = Math.floor(Math.random() * 6) + 1;
      dado1.innerText = varDado1;
      dado2.innerText = varDado2;
      let lanzar = new throwDice();
      lanzar.throw(select, varDado1, varDado2);
    }
  } else {
    alert("No ha iniciado el juego");
  }
});

class Jugador {
  constructor(username) {
    this.username = username;
    this.punctuation = 0;
    this.numberOfPitches = 0;
    this.saldo = 100;
    this.losses = 0;
    this.profits = 0;
  }
  getLosses() {
    return this.losses;
  }
  getProfits() {
    return this.profits;
  }
  getUsername() {
    return this.username;
  }
  getSaldo() {
    return this.saldo;
  }
  getNumberOfPitches() {
    return this.numberOfPitches;
  }
  getPunctuation() {
    return this.punctuation;
  }
  setnumberOfPitches(numberOfPitches) {
    this.numberOfPitches = numberOfPitches;
  }
  setPunctuation(punctuation) {
    this.punctuation = punctuation;
  }
  increaseNumberOfPitches() {
    if (this.numberOfPitches > 10) {
      this.numberOfPitches = this.numberOfPitches;
    } else {
      this.numberOfPitches = this.numberOfPitches + 1;
    }
    return this.numberOfPitches;
  }
  newPunctuation(varDado1, varDado2) {
    this.punctuation = this.punctuation + varDado1 + varDado2;
    return this.punctuation;
  }
  increaseBalance(newSaldo) {
    this.profits = this.profits + newSaldo;
    this.saldo = this.saldo + newSaldo;
  }
  decreaseBalance(newSaldo) {
    this.losses = this.losses + newSaldo;
    this.saldo = this.saldo - newSaldo;
  }
  checkBalance() {
    if (this.saldo < 0) {
      this.saldo = 0;
      console.log(
        "El jugador " +
          this.username +
          " ha perdido su saldo es de " +
          this.saldo
      );
    }
    return this.saldo;
  }
}
class throwDice {
  throw(Jugador, varDado1, varDado2) {
    Jugador.increaseNumberOfPitches();
    obtenerDatos();
    let winner = false;
    winner = selectWinner();
    if (winner) {
      obtenerDatos();
    } else {
      if (Jugador.getNumberOfPitches() > 10) {
        alert(
          "El jugador " + Jugador.getUsername() + " ya excedio sus lanzamientos"
        );
      } else {
        Jugador.newPunctuation(varDado1, varDado2);
        obtenerDatos();
      }
    }
  }
}
function obtenerDatos() {
  saldoPlayer1.innerText = "Saldo: " + player1.getSaldo();
  saldoPlayer2.innerText = "Saldo: " + player2.getSaldo();
  saldoPlayer3.innerText = "Saldo: " + player3.getSaldo();
  lossesPlayer1.innerText = "Perdidas de: " + player1.getLosses();
  lossesPlayer2.innerText = "Perdidas de: " + player2.getLosses();
  lossesPlayer3.innerText = "Perdidas de: " + player3.getLosses();
  profitsPlayer1.innerText = "Ganancia de: " + player1.getProfits();
  profitsPlayer2.innerText = "Ganancia de: " + player2.getProfits();
  profitsPlayer3.innerText = "Ganancia de: " + player3.getProfits();
  pointsPlayer1.innerText =
    " Lleva una puntuacion de: " +
    player1.getPunctuation() +
    " con " +
    player1.getNumberOfPitches() +
    " lanzaminetos";
  pointsPlayer2.innerText =
    " Lleva una puntuacion de: " +
    player2.getPunctuation() +
    " con " +
    player2.getNumberOfPitches() +
    " lanzaminetos";
  pointsPlayer3.innerText =
    " Lleva una puntuacion de: " +
    player3.getPunctuation() +
    " con " +
    player3.getNumberOfPitches() +
    " lanzaminetos";
}

function selectWinner() {
  if (
    player1.getNumberOfPitches() > 10 &&
    player2.getNumberOfPitches() > 10 &&
    player3.getNumberOfPitches() > 10
  ) {
    if (player1.getPunctuation() > player2.getPunctuation()) {
      if (player1.getPunctuation() > player3.getPunctuation()) {
        alert("Ha ganado el jugador " + player1.getUsername());
        player1.increaseBalance(
          parseInt(Apuesta2.value) + parseInt(Apuesta3.value)
        );
        player2.decreaseBalance(parseInt(Apuesta2.value));
        player3.decreaseBalance(parseInt(Apuesta3.value));
        return true;
      } else {
        alert("Ha ganado el jugador " + player3.getUsername());
        player3.increaseBalance(
          parseInt(Apuesta1.value) + parseInt(Apuesta2.value)
        );
        player2.decreaseBalance(parseInt(Apuesta2.value));
        player1.decreaseBalance(parseInt(Apuesta1.value));
        return true;
      }
    } else {
      if (player2.getPunctuation() > player3.getPunctuation()) {
        alert("Ha ganado el jugador " + player2.getUsername());
        player2.increaseBalance(
          parseInt(Apuesta1.value) + parseInt(Apuesta3.value)
        );
        player1.decreaseBalance(parseInt(Apuesta1.value));
        player3.decreaseBalance(parseInt(Apuesta3.value));
        return true;
      } else {
        alert("Ha ganado el jugador " + player3.getUsername());
        player1.decreaseBalance(parseInt(Apuesta1.value));
        player2.decreaseBalance(parseInt(Apuesta2.value));
        player3.increaseBalance(
          parseInt(Apuesta2.value) + parseInt(Apuesta1.value)
        );
        return true;
      }
    }
  }
}
