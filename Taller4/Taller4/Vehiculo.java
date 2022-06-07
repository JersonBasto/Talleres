package Taller4.Taller4;

import java.sql.Date;

public class Vehiculo {
    Integer numberOfPassengers;
    Boolean crew;
    Integer numberOfWheels;
    Date enrollmentDate;
    String displacementMedium;
    Integer numberOfDoors;
    Boolean electricMotor;
    Boolean onGoing;

    public Vehiculo(Integer numberOfPassengers, Boolean crew, Integer numberOfWheels, Date enrollmentDate,
            String displacementMedium, Integer numberOfDoors, Boolean electricMotor, Boolean onGoing) {
        this.numberOfPassengers = numberOfPassengers;
        this.crew = crew;
        this.numberOfWheels = numberOfWheels;
        this.enrollmentDate = enrollmentDate;
        this.displacementMedium = displacementMedium;
        this.numberOfDoors = numberOfDoors;
        this.electricMotor = electricMotor;
        this.onGoing = onGoing;
    }

    public Vehiculo(Integer numberOfPassengers, Boolean crew, Integer numberOfWheels, Date enrollmentDate,
            String displacementMedium, Integer numberOfDoors, Boolean electricMotor) {
        this.numberOfPassengers = numberOfPassengers;
        this.crew = crew;
        this.numberOfWheels = numberOfWheels;
        this.enrollmentDate = enrollmentDate;
        this.displacementMedium = displacementMedium;
        this.numberOfDoors = numberOfDoors;
        this.electricMotor = electricMotor;
        this.onGoing = false;
    }

    public void ExistCrew() {
        if (crew) {
            crew = false;
            System.out.println("No hay tripulacion dentro del vehiculo");
        } else {
            crew = true;
            System.out.println("Hay tripulacion dentro del vehiculo");
        }
    }

    public void vehicleOnGoing() {
        if (onGoing) {
            onGoing = false;
            System.out.println("El vehiculo no esta en marcha");
        } else {
            onGoing = true;
            System.out.println("El vehiculo esta en marcha");
        }
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public Boolean getCrew() {
        return crew;
    }

    public void setCrew(Boolean crew) {
        this.crew = crew;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getDisplacementMedium() {
        return displacementMedium;
    }

    public void setDisplacementMedium(String displacementMedium) {
        this.displacementMedium = displacementMedium;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Boolean getElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(Boolean electricMotor) {
        this.electricMotor = electricMotor;
    }

    public Boolean getOnGoing() {
        return onGoing;
    }

    public void setOnGoing(Boolean onGoing) {
        this.onGoing = onGoing;
    }
}
