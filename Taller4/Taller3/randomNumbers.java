package Taller4.Taller3;

import java.util.Random;

public class randomNumbers {
    public int sizeArray;
    int[] numbers = new int[sizeArray];

    public randomNumbers(int sizeArray, int[] numbers) {
        this.sizeArray = sizeArray;
        this.numbers = numbers;
    }

    public randomNumbers() {
    }

    public int[] generateArray(Integer sizeArray) {
        int[] numbers = new int[sizeArray];
        Random rand = new Random();
        for (int x = 0; x < numbers.length; x++) {
            numbers[x]= rand.nextInt();
        }
        printArray(numbers);
        return numbers;
    }

    public void printArray(int[] numbersOrganize){
        System.out.println("Array aleatorio desordenado: ");
        System.out.println("##--------------------------##");
        for (int x = 0; x < numbersOrganize.length; x++) {
            if(x==0){
                System.out.print("[ "+numbersOrganize[x]+",");
            }
            else if(x==numbersOrganize.length-1){
                System.out.println(numbersOrganize[x]+" ]");
            }
            else{
                System.out.print(numbersOrganize[x]+",");
            }
            
        }
    }
}
