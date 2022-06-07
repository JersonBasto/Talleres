package Taller4.Taller3;

public class Main {
    public static int numbers[];

    public static void main(String[] args) {
        Input in = new Input();
        Integer sizeArray = 0;
        Boolean conti = true;
        while (conti) {
            System.out.println("Bienvendo a continuacion seleccione el metodo de solucion para ordenar el array");
            System.out.println(" 1 : Ordenar por Algoritmo Burbuja");
            System.out.println(" 2 : Ordenar por QuickShort");
            System.out.println(" 0 : Terminar Programa");
            Integer index = in.inputIndex("Seleccione el indice del ordenador: ", 3);
            sizeArray = in.intInput("Ingrese el tamaño del array");
            randomNumbers numbers = new randomNumbers();
            int[] randNumber = numbers.generateArray(sizeArray);
            switch (index) {
                case 0 -> {
                    conti=false;
                }
                case 1 -> {
                    System.out.println("Bienvenido al organizador de numeros a traves del Algoritmo Burbuja");
                    bubble bubbleNumber = new bubble(randNumber);
                }
                case 2 -> {
                    System.out.println("Bienvenido al organizador de numeros a traves de QuickShort");
                    QuickSort quickNumber= new QuickSort(randNumber);
                }
            }
        }

    }
}
