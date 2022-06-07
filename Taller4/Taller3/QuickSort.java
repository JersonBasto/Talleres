package Taller4.Taller3;

public class QuickSort {
    private int[] numbers;

    public QuickSort(int[] numbers) {
        this.numbers = dataOrganize(numbers);
    }

    public int[] dataOrganize(int[] numbers) {
        final int N = numbers.length;
        return organize(numbers, 0, N - 1);
    }

    public int[] organize(int[] numbers, Integer start, Integer finall) {
        if (start >= finall) {
            printArrays(numbers);
            return numbers;
        }
        Integer pivot = numbers[start];
        Integer izq = start + 1;
        Integer der = finall;
        while (izq <= der) {
            while (izq <= finall && numbers[izq] < pivot) {
                izq++;
            }
            while (der > start && numbers[der] >= pivot) {
                der--;
            }
            if (izq < der) {
                Integer aux = numbers[izq];
                numbers[izq] = numbers[der];
                numbers[der] = aux;
            }
        }
        if (der > start) {
            Integer aux = numbers[start];
            numbers[start] = numbers[der];
            numbers[der] = aux;
        }
        organize(numbers, start, der - 1);
        organize(numbers, der + 1, finall);
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
