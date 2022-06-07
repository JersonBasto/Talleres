package Taller4.Taller6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        dynamicArray();
    }

    public static Input in = new Input();

    public static void dynamicArray() {
        Integer cont = 0;
        Boolean Already = false;
        ArrayList<Integer> arrayNumbers = new ArrayList<Integer>();
        while (arrayNumbers.size() < 2) {
            arrayNumbers.add(in.intInput("Ingrese un valor entero"));
            if (arrayNumbers.size() == 2) {
                if (arrayNumbers.get(cont) == arrayNumbers.get(cont - 1)) {
                    Already = true;
                }
            }
            cont++;
        }
        if (Already == false) {
            while (arrayNumbers.get(cont - 1) != arrayNumbers.get(cont - 2)) {
                arrayNumbers.add(in.intInput("Ingrese un valor entero"));
                cont++;
            }
        }
        arrayNumbers.forEach(n -> System.out.print(n + ","));
    }
}
