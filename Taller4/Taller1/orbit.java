package Taller4.Taller1;

import java.util.Map;

public class orbit {
    public Map<Integer, Planet> planets;
    public Integer orbit;

    public orbit(Map<Integer, Planet> planets) {
        this.planets = planets;
    }

    public void quantityPlanet() {
        orbit++;
    }
}
