package Taller4.Taller4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<vehicle> vehiculos = new ArrayList<>();
        Integer numberOfPassengers;
        Boolean crew;
        Integer numberOfWheels;
        Date enrollmentDate;
        String displacementMedium;
        Integer numberOfDoors;
        Boolean electricMotor,conti=true;

        Input in = new Input();

        System.out.println("A continuacion debera ingresar 10 vehiculos,se le pedira datos para cada vehicuo");
        for (int x = 0; x < 10; x++) {
            System.out.println("Vehiculo " + x + " :");
            numberOfPassengers = in.intInput("¿Cuanto pasajeros pueden entrar en el vehiculo?");
            crew = Boolean.parseBoolean(in.inputBoolean("¿Hay personas dentro del vehiculo?"));
            numberOfWheels = in.intInput("¿Numero de ruedas del vehiculo?");
            enrollmentDate = in.InputDate("¿ Ingrese la fecha de matriculacion?");
            displacementMedium = in.strInput("¿ El vehiculo transita por: ?");
            numberOfDoors = in.intInput("¿ El vehiculo cuantas puertas tiene?");
            electricMotor = Boolean.parseBoolean(in.inputBoolean(" ¿ Tiene motor electrico?"));
            vehiculos.add(new vehicle(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate,
                    displacementMedium, electricMotor, crew));
        }

        while (conti) {
            for (int z = 0; z < vehiculos.size(); z++) {
                System.out.println(z + " : " + "Vehiculo " + z);
            }
            Integer index = in.inputIndex("Seleccione un vehiculo para observar sus datos", 10);
            System.out.println("El vehiculo admite: " + vehiculos.get(index).getNumberOfPassengers() + " pasajeros");
            System.out.println("El vehiculo tiene: " + vehiculos.get(index).getNumberOfDoors() + " puertas");
            System.out.println("El vehiculo cuenta con motor electrico: " + vehiculos.get(index).getElectricMotor());
            System.out.println("El vehiculo tiene " + vehiculos.get(index).getNumberOfWheels() + " ruedas");
            System.out.println("El vehiculo fue matriculado en " + vehiculos.get(index).getEnrollmentDate());
            System.out.println("El vehiculo tiene pasajeros: " + vehiculos.get(index).getCrew());
            System.out.println("El vehiculo transita por: " + vehiculos.get(index).getDisplacementMedium());
            conti=Boolean.parseBoolean(in.inputBoolean("Quiere observar mas vehiculos?"));
        }

    }
}
