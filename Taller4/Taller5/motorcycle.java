package Taller4.Taller5;

import java.util.Date;

public class motorcycle extends vehicle {
    String cylinderCapacity;
    Boolean automatic;

    public motorcycle(Integer numberOfPassengers, Integer numberOfWheels, Integer numberOfDoors, Date enrollmentDate,
            String displacementMedium, String color, Boolean crew, String cylinderCapacity, Boolean automatic) {
        super(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate, displacementMedium, color, crew);
        this.cylinderCapacity = cylinderCapacity;
        this.automatic = automatic;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public Boolean getAutomatic() {
        return automatic;
    }

    public void setAutomatic(Boolean automatic) {
        this.automatic = automatic;
    }
}
