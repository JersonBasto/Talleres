package Taller4.Taller5;

import java.util.Date;

public class truck extends vehicle {
    Double height, usefulLoad;
    String typeOfLoad;

    public truck(Integer numberOfPassengers, Integer numberOfWheels, Integer numberOfDoors, Date enrollmentDate,
            String displacementMedium, String color, Boolean crew, Double usefulLoad, Double height,
            String typeOfLoad) {
        super(numberOfPassengers, numberOfWheels, numberOfDoors, enrollmentDate, displacementMedium, color, crew);
        this.usefulLoad = usefulLoad;
        this.height = height;
        this.typeOfLoad = typeOfLoad;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getUsefulLoad() {
        return usefulLoad;
    }

    public void setUsefulLoad(Double usefulLoad) {
        this.usefulLoad = usefulLoad;
    }

    public String getTypeOfLoad() {
        return typeOfLoad;
    }

    public void setTypeOfLoad(String typeOfLoad) {
        this.typeOfLoad = typeOfLoad;
    }

}
