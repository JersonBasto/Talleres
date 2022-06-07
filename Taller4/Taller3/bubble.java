package Taller4.Taller3;

public class bubble {

    private int[] numbers;

    public bubble(int[] numbers) {
        this.numbers = organize(numbers);
    }

    public int[] organize(int[] numbers) {
        int aux;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < (numbers.length - i); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        printArrays(numbers);
        return numbers;
    }

    public void printArrays(int[] numbersOrganize) {
        System.out.println("Array aleatorio ordenado: ");
        System.out.println("##--------------------------##");
        for (int x = 0; x < numbersOrganize.length; x++) {
            if (x == 0) {
                System.out.print("[ " + numbersOrganize[x] + ",");
            } else if (x == numbersOrganize.length - 1) {
                System.out.println(numbersOrganize[x] + " ]");
            } else {
                System.out.print(numbersOrganize[x] + ",");
            }

        }
        System.out.println("##--------------------------##");
    }

}
