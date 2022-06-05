package Taller4.Taller1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Planets {
    LinkedHashMap<Integer, Planet> planetList = new LinkedHashMap<>();

    public Planets(Integer numberPlanet,Planet planet) {
        this.planetList = addPlanet(numberPlanet, planet);
    }  
    
    public Planets(Integer numberPlanet) {
        this.planetList = createList(numberPlanet);
    }

    public LinkedHashMap<Integer, Planet> createList(Integer numberList ){
        LinkedHashMap<Integer, Planet> planetList = new LinkedHashMap<>();
        return planetList;
    }

    public LinkedHashMap<Integer, Planet> addPlanet(Integer numberList, Planet planet){
        planetList.put(numberList, planet);

        return planetList;
    }

    public List<Planet> printListPlanets(){
        List<Planet> planets = new ArrayList<Planet>(this.planetList.values());

        planets.forEach(p-> 
        System.out.println(p.getIdentifier()+": "+ p.getNamePlanet())
        );

        return planets;
    }
}
