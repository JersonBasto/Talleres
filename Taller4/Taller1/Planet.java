package Taller4.Taller1;

public class Planet {
    public double density;
    public double dough;
    public double diameter;
    public double distanceToSun;
    public String namePlanet;
    public Integer identifier;

    public Planet(double density, double dough, double diameter,
            double distanceToSun, String namePlanet, Integer identifier) {
        this.density = density;
        this.dough = dough;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.namePlanet = namePlanet;
        this.identifier = identifier;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDough() {
        return dough;
    }

    public void setDough(double dough) {
        this.dough = dough;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

}
