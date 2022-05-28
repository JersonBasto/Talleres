/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author j_dbg
 */
public class Pruebas {

    public static void main(String[] args) throws ParseException {
        int index;
        int quantity;
        int x = 1;
        String name, lastName1, lastName2;
        Date dateBirth;
        String fechaSinFormat;
        float height;
        int y = 0;
        int c = 0;
        String color;
        ArrayList<String> colors = new ArrayList<>();
        float averageWeight;
        int accountNumber;
        boolean activated;
        int modelCar, memoryRam, storageSize;
        String licensePlate, makeCar, colorCar, model, processor, modelVideoCard;
        Boolean Electric, motor, peripherals;

        Input in = new Input();

        System.out.println(
                "A continuacion se presentara las clases con su indice");
        System.out.println(
                "Personas : 1");
        System.out.println(
                "Frutas : 2");
        System.out.println(
                "Cuenta Bancaria : 3");
        System.out.println(
                "Carros : 4");
        System.out.println(
                "Ciclas : 5");
        System.out.println(
                "Computadores : 6");

        index = Integer.parseInt(in.InputInt("Para ingresar a las clases escriba el numero correspondiente: "));

        switch (index) {
            case 1 -> {
                x = 1;
                SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
                quantity = Integer.parseInt(in.InputInt("Cuantas personas va ingresar: "));
                Person vector[] = new Person[quantity];
                while (x <= quantity) {
                    name = in.InputString("Ingrese el nombre de la persona " + Integer.toString(x) + " : ");
                    lastName1 = in.InputString("Ingrese el 1er apellido de la persona " + Integer.toString(x) + " : ");
                    lastName2 = in.InputString("Ingrese el 2do apellido de la persona " + Integer.toString(x) + " : ");
                    dateBirth = in.InputDate("Ingrese la fecha de nacimiento de la persona" + Integer.toString(x) + " : ");
                    height = Float.parseFloat(in.InputInt("Ingrese el peso de la persona " + Integer.toString(x) + " : "));
                    vector[x - 1] = new Person(name, lastName1, lastName2, dateBirth, height);
                    x += 1;
                }
            }
            case 2 -> {
                x = 1;
                quantity = Integer.parseInt(in.InputInt("Cuantas frutas quiere ingresar " + Integer.toString(x) + " : "));
                Frutas vector[] = new Frutas[quantity];
                while (x <= quantity) {
                    name = in.InputString("Ingrese el nombre de la fruta " + Integer.toString(x) + " : ");
                    averageWeight = Float.parseFloat(in.InputInt("Ingrese el Peso Promedio " + Integer.toString(x) + " : "));
                    c = Integer.parseInt(in.InputInt("Cuantos colores son: "));
                    y = 1;
                    while (y <= c) {
                        color = in.InputString("Ingrese el color " + Integer.toString(y) + " : ");
                        colors.add(color);
                        y += 1;
                    }
                    vector[x - 1] = new Frutas(name, colors, averageWeight);
                    x += 1;
                }
            }
            case 3 -> {
                quantity = Integer.parseInt(in.InputInt("Cuantas cuentas piensa observar: "));
                CuentaBancaria vector[] = new CuentaBancaria[quantity];
                x = 1;
                while (x <= quantity) {
                    accountNumber = Integer.parseInt(in.InputInt("Ingrese el numero de la cuenta "+ Integer.toString(x)));
                    activated = Boolean.parseBoolean(in.InputBoolean("Ingrese el estado de la cuenta "+ Integer.toString(x)));
                    vector[x - 1] = new CuentaBancaria(accountNumber, activated);
                    x += 1;
                }
            }
            case 4 -> {
                quantity = Integer.parseInt(in.InputInt("Cuantos carros quiere ingresar"));
                Carros vector[] = new Carros[quantity];
                x = 1;
                while (x <= quantity) {
                    modelCar = Integer.parseInt(in.InputInt("Ingrese el año del modelo del carro "+ Integer.toString(x)));
                    licensePlate = in.licensePlate("Ingrese la placa del carro "+ Integer.toString(x));
                    makeCar = in.InputString("ingrese la marca del carro "+ Integer.toString(x));
                    colorCar = in.InputString("Ingrese el color del carros "+ Integer.toString(x));
                    vector[x - 1] = new Carros(modelCar, licensePlate, makeCar, colorCar);
                    x += 1;
                }
            }
            case 5 -> {
                quantity = Integer.parseInt(in.InputInt("Cuantas cicla quiere ingresar"));
                Ciclas vector[] = new Ciclas[quantity];
                x = 1;
                while (x <= quantity) {
                    color = in.InputString("Ingrese el color de la cicla "+ Integer.toString(x));
                    Electric = Boolean.parseBoolean(in.InputBoolean("¿La cicla "+ Integer.toString(x) +" es electrica?"));
                    motor = Boolean.parseBoolean(in.InputBoolean("¿La cicla "+ Integer.toString(x) +" tiene motor?"));
                    model = in.InputString("Ingrese el modelo de la cicla "+ Integer.toString(x));
                    vector[x - 1] = new Ciclas(color, Electric, motor, model);
                    x += 1;
                }
            }
            case 6 -> {
                quantity = Integer.parseInt(in.InputInt("Cuantos computadores quiere ingresar"));
                Computers vector[] = new Computers[quantity];
                x = 1;
                while (x <= quantity) {
                    memoryRam = Integer.parseInt(in.InputInt("Ingrese el tamaño de la memoria RAM en GB del computador "+ Integer.toString(x)));
                    processor = in.InputString("Ingrese el modelo del procesador del computador "+ Integer.toString(x));
                    modelVideoCard = in.InputString("Ingrese el modelo de la tarjeta de video del computador "+ Integer.toString(x));
                    storageSize = Integer.parseInt(in.InputInt("Ingrese el tamaño de almacenamiento en GB del computador "+ Integer.toString(x)));
                    peripherals = Boolean.parseBoolean(in.InputBoolean("¿El computador "+ Integer.toString(x) +" cuenta con perifericos?"));
                    vector[x - 1] = new Computers(memoryRam, processor, modelVideoCard, storageSize, peripherals);
                    x += 1;
                }
            }
            default -> {
            }
        }
    }
}
