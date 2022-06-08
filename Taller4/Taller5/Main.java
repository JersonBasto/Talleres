package Taller4.Taller5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Integer numberOfPassengers = 0;
        Boolean crew = false;
        Integer numberOfWheels = 0;
        Date enrollmentDate = new Date();
        String displacementMedium = "", color = "", typeOfLoad = "", cylinderCapacity = "";
        Integer numberOfDoors = 0;
        Boolean electricMotor, create = true, raceCar, changes, motor, sail, oars, automatic, conti = true;
        Double height, usefulLoad = 0.0;
        List<vehicle> vehiculos = new ArrayList<>();
        Input in = new Input();

        while (conti) {
            System.out.println("Bienvenido a continuacion seleccione una opcion en el menu :");
            System.out.println(" 1 : Crear un vehiculo a partir de las clases ");
            System.out.println(" 2 : Observar un vehiculo creado ");
            System.out.println(" 0 : Salir del programa ");

            Integer indexP = in.inputIndex("Coloque el numero del menu a seleccionar ", 3);
            switch (indexP) {
                case 0 -> {
                    conti = false;
                }
                case 1 -> {
                    create=true;
                    while (create) {
                        System.out
                                .println(
                                        "A continuacion se presenta una lista de los diferentes vehiculos que se pueden crear: ");
                        System.out.println(" Carro : 1");
                        System.out.println(" Camion : 2");
                        System.out.println(" Bicicleta : 3");
                        System.out.println(" Lancha : 4");
                        System.out.println(" Motocicleta : 5");
                        System.out.println(" Salir del programa : 0");
                        Integer index = in.inputIndex("Seleccione el indice asociado al tipo de vehiculo: ", 6);
                        if (index != 0) {
                            numberOfPassengers = in.intInput("¿Cuanto pasajeros pueden entrar en el vehiculo?");
                            crew = in.inputBoolean("¿Hay personas dentro del vehiculo?");
                            numberOfWheels = in.intInput("¿Numero de ruedas del vehiculo?");
                            enrollmentDate = in.InputDate("¿ Ingrese la fecha de matriculacion?");
                            displacementMedium = in.inDisplacementMedium("¿ El vehiculo transita por: ?");
                            color = in.strInput("¿ De que color es el carro ?");
                            numberOfDoors = in.intInput("¿ El vehiculo cuantas puertas tiene?");
                        }
                        switch (index) {
                            case 0 -> {
                                create = false;
                            }
                            case 1 -> {
                                electricMotor = in.inputBoolean(" ¿ Tiene motor electrico?");
                                raceCar = in.inputBoolean(" ¿ El carro es de carreras ?");
                                vehiculos.add(new car(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate,
                                        displacementMedium, color, crew, electricMotor, raceCar));
                            }
                            case 2 -> {
                                typeOfLoad = in.intypeOfLoad("Que tipo de carga lleva en el camion: ");
                                usefulLoad = in.inputDouble("Cuantas toneladas puede llevar el camion");
                                height = in.inputDouble("Que altura tiene el camion: ");
                                vehiculos.add(
                                        new truck(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate,
                                                displacementMedium, color, crew, usefulLoad, height, typeOfLoad));
                            }
                            case 3 -> {
                                motor = in.inputBoolean("La cicla tiene motor ?");
                                changes = in.inputBoolean("La cicla cuenta con cambios ?");
                                vehiculos
                                        .add(new bike(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate,
                                                displacementMedium, color, crew, changes, motor));
                            }
                            case 4 -> {
                                sail = in.inputBoolean("La lancha cuenta con velas? ");
                                oars = in.inputBoolean("La lancha tiene remos?");
                                vehiculos
                                        .add(new boat(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate,
                                                displacementMedium, color, crew, oars, sail));
                            }
                            case 5 -> {
                                cylinderCapacity = in.inCylinderCapacity("Cual es el cilindraje de la moto? ");
                                automatic = in.inputBoolean("La moto es automatica ?");
                                vehiculos.add(new motorcycle(numberOfPassengers, numberOfWheels, numberOfDoors,
                                        enrollmentDate, displacementMedium, color, crew, cylinderCapacity, automatic));
                            }
                        }
                    }
                }
                case 2 -> {
                    printListVehicles(vehiculos, in);
                }
            }

        }
    }

    public static void printListVehicles(List<vehicle> vehiculos, Input in) {
        for (int x = 0; x < vehiculos.size(); x++) {
            System.out.println(x + " : Vehiculo " + x);
        }
        printVehicle(in.inputIndex("Ingrese el indice del carro a observar", vehiculos.size()), vehiculos);
    }

    public static void printVehicle(Integer index, List<vehicle> vehiculos) {
        vehiculos.get(index).printVehicle();
    }

}
