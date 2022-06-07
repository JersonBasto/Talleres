package Taller4.Taller5;

import java.util.Date;

public class boat extends vehicle {
    Boolean oars;
    Boolean sail;

    public boat(Integer numberOfPassengers, Integer numberOfWheels, Integer numberOfDoors, Date enrollmentDate,
            String displacementMedium, String color, Boolean crew, Boolean oars, Boolean sail) {
        super(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate, displacementMedium, color, crew);
        this.oars = oars;
        this.sail = sail;
    }

    public Boolean getOars() {
        return oars;
    }

    public void setOars(Boolean oars) {
        this.oars = oars;
    }

    public Boolean getSail() {
        return sail;
    }

    public void setSail(Boolean sail) {
        this.sail = sail;
    }
}
