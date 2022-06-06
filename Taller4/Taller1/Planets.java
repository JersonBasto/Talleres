package Taller4.Taller1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Planets {
    LinkedHashMap<Integer, Planet> planetList = new LinkedHashMap<>();

    public Planets(Integer numberPlanet, Planet planet) {
        this.planetList = addPlanet(numberPlanet, planet);
    }

    public Planets(Integer numberPlanet) {
        this.planetList = createList(numberPlanet);
    }

    public LinkedHashMap<Integer, Planet> createList(Integer numberList) {
        LinkedHashMap<Integer, Planet> planetList = new LinkedHashMap<>();
        return planetList;
    }

    public LinkedHashMap<Integer, Planet> addPlanet(Integer numberList, Planet planet) {
        planetList.put(numberList, planet);

        return planetList;
    }

    public void printListPlanets() {
        List<Planet> planets = new ArrayList<Planet>(this.planetList.values());

        planets.forEach(p -> System.out.println(p.getIdentifier() + ": " + p.getNamePlanet()));
    }

    public Double densityPlanet(Integer index) {
        List<Planet> planets = new ArrayList<Planet>(this.planetList.values());
        return planets.get(index).getDensity();
    }

    public Double doughPlanet(Integer index) {
        List<Planet> planets = new ArrayList<Planet>(this.planetList.values());
        return planets.get(index).getDough();
    }

    public Double distanceToSunPlanet(Integer index) {
        List<Planet> planets = new ArrayList<Planet>(this.planetList.values());
        return planets.get(index).getDistanceToSun();
    }

    public Integer identifierPlanet(Integer index) {
        List<Planet> planets = new ArrayList<Planet>(this.planetList.values());
        return planets.get(index).getIdentifier();
    }

    public Double gravitationalForce(String listPlanets) {
        Double gravitationalForce = 0.0;
        String[] planetsId = listPlanets.split(",");
        String planet1 = planetList.get(Integer.parseInt(planetsId[0])).getNamePlanet();
        String planet2 = planetList.get(Integer.parseInt(planetsId[1])).getNamePlanet();
        Double m1 = planetList.get(Integer.parseInt(planetsId[0])).getDough();
        System.out.println("Masa planeta " + planet1 + " : " + m1);
        Double m2 = planetList.get(Integer.parseInt(planetsId[1])).getDough();
        System.out.println("Masa planeta " + planet2 + " : " + m2);
        System.out.println("Distancia del planeta " + planet1 + " : "
                + planetList.get(Integer.parseInt(planetsId[0])).getDistanceToSun());
        System.out.println("Distancia del planeta " + planet2 + " : "
                + planetList.get(Integer.parseInt(planetsId[1])).getDistanceToSun());
        Double distance = Math.abs(planetList.get(Integer.parseInt(planetsId[0])).getDistanceToSun()
                - planetList.get(Integer.parseInt(planetsId[1])).getDistanceToSun());
        System.out.println("Distancia entre los dos planetas: " + distance);
        double G = 6.61 * Math.pow(10, -11);
        gravitationalForce = (G * (m1 * m2) / Math.pow(distance, 2));
        return gravitationalForce;
    }

}
