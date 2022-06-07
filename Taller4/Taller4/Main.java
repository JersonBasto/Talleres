package Taller4.Taller4;

import java.util.Date;
import java.util.List;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Vehiculo> vehiculos;
        Integer numberOfPassengers;
        Boolean crew;
        Integer numberOfWheels;
        Date enrollmentDate;
        String displacementMedium;
        Integer numberOfDoors;
        Boolean electricMotor;

        Input in = new Input();

        System.out.println("A continuacion debera ingresar 10 vehiculos,se le pedira datos para cada vehicuo");
        for (int x = 0; x < 10; x++) {
            System.out.println("Vehiculo " + x + " :");
            numberOfPassengers = in.intInput("¿Cuanto pasajeros pueden entrar en el vehiculo?");
            crew = Boolean.parseBoolean(in.inputBoolean("¿Hay personas dentro del vehiculo?"));
            numberOfWheels = in.intInput("¿Numero de ruedas del vehiculo?");
            enrollmentDate = in.InputDate("¿ Ingrese la fecha de matriculacion?");
            displacementMedium = in.strInput("¿ El vehiculo transitopo: ?");
            numberOfDoors = in.intInput("¿ El vehiculo cuantas puertas tiene?");
            electricMotor = Boolean.parseBoolean(in.inputBoolean(" ¿ Tiene motor electrico?"));
            vehiculos.add(new Vehiculo(numberOfPassengers, crew, numberOfWheels, enrollmentDate, displacementMedium,
                    numberOfDoors, electricMotor));
        }
    }
}
