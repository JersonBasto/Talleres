package Taller4.Taller1;

import java.util.LinkedHashMap;

public abstract class PlanetarySystem {
    static LinkedHashMap<String, Planets> planetList = new LinkedHashMap<>();

    public PlanetarySystem(String namePlanetarySystem, Planets planets) {
        this.planetList = createSystem(namePlanetarySystem, planets);
    }

    public LinkedHashMap<String, Planets> createSystem(String namePlanetarySystem, Planets planets){
        LinkedHashMap<String, Planets> planetList = new LinkedHashMap<>();

        planetList.put(namePlanetarySystem, planets);

        return planetList;
    }
}