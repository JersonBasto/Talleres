package Taller4.Taller4;

import java.util.Date;

public class vehicle {
    Integer numberOfPassengers, numberOfWheels, numberOfDoors;
    Date enrollmentDate;
    String displacementMedium;
    Boolean electricMotor, crew, onGoing;

    

    public vehicle(Integer numberOfPassengers, Integer numberOfWheels, Integer numberOfDoors, Date enrollmentDate,
            String displacementMedium, Boolean electricMotor, Boolean crew) {
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.enrollmentDate = enrollmentDate;
        this.displacementMedium = displacementMedium;
        this.electricMotor = electricMotor;
        this.crew = crew;
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
