package Taller4.Taller5;

import java.util.Date;

public class bike extends vehicle {
    Boolean changes;
    Boolean motor;

    public bike(Integer numberOfPassengers, Integer numberOfWheels, Integer numberOfDoors, Date enrollmentDate,
            String displacementMedium, String color, Boolean crew, Boolean changes, Boolean motor) {
        super(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate, displacementMedium, color, crew);
        this.changes = changes;
        this.motor = motor;
    }

    public Boolean getChanges() {
        return changes;
    }

    public void setChanges(Boolean changes) {
        this.changes = changes;
    }

    public Boolean getMotor() {
        return motor;
    }

    public void setMotor(Boolean motor) {
        this.motor = motor;
    }
}
