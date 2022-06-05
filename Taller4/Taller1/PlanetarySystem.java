package Taller4.Taller1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class PlanetarySystem {
    LinkedHashMap<String, Planets> planetList = new LinkedHashMap<>();
    Integer cont = 0;

    public PlanetarySystem(String namePlanetarySystem, Planets planets) {
        this.planetList = createSystem(namePlanetarySystem, planets);
    }

    public LinkedHashMap<String, Planets> createSystem(String namePlanetarySystem, Planets planets) {
        LinkedHashMap<String, Planets> planetList = new LinkedHashMap<>();

        planetList.put(namePlanetarySystem, planets);

        return planetList;
    }

    public void printPlanetarySystemWithPlanets() {
        this.planetList.keySet().forEach(p -> {
            System.out.println(p);
        });
        this.planetList.values().forEach(s -> {
            System.out.println(s.printListPlanets());
        });
    }

    public void printPlanetarySystem(Integer cont) {
        List<String> listOfPlanetarySystem = new ArrayList<String>();
        this.planetList.keySet().forEach(p -> listOfPlanetarySystem.add(p));
        listOfPlanetarySystem.forEach(pl -> System.out.println(cont + " : " + pl));
    }

}