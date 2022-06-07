package Taller4.Taller5;

import java.util.Date;

public class car extends vehicle {
    Boolean electricMotor;
    Boolean raceCar;

    public car(Integer numberOfPassengers, Integer numberOfWheels, Integer numberOfDoors, Date enrollmentDate,
            String displacementMedium, String color, Boolean crew, Boolean electricMotor, Boolean raceCar) {
        super(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate, displacementMedium, color, crew);
        this.electricMotor = electricMotor;
        this.raceCar = raceCar;
    }

    public Boolean getElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(Boolean electricMotor) {
        this.electricMotor = electricMotor;
    }

    public Boolean getRaceCar() {
        return raceCar;
    }

    public void setRaceCar(Boolean raceCar) {
        this.raceCar = raceCar;
    }

    public void printCar() {
        System.out.println("El carro tiene motor electrico : " + getElectricMotor());
        System.out.println("Hay personas dentro del carro : " + getCrew());
        System.out.println("El carro transita por : " + getDisplacementMedium());
        System.out.println("El carro tiene " + getNumberOfDoors() + " puertas");
        System.out.println("El carro admite " + getNumberOfPassengers() + " pasajeros");
        System.out.println("El carro tiene " + getNumberOfWheels() + " llantas");
        System.out.println("El carro es de carreras : " + getRaceCar());
        System.out.println("El carro es de color " + getColor());
        System.out.println("El carro fue matriculado en: " + getEnrollmentDate());
    }
}
