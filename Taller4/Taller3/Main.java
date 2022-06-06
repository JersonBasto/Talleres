package Taller4.Taller3;

public class Main {

    public static void main(String[] args) {
        Input in = new Input();
        Integer sizeArray = 0;
        System.out.println("Bienvenido al organizador de numeros a traves del Algoritmo Burbuja");
        sizeArray= in.intInput("Ingrese el tamaño del array");
        randomNumbers numbers = new randomNumbers();
        int[] randNumber = numbers.generateArray(sizeArray);
        bubble bubbleNumber = new bubble(randNumber);
    }
}
