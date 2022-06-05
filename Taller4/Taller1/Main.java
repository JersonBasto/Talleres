package Taller4.Taller1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boolean create = true;
        Boolean conti = true;
        Double density, dough, diameter, distanceToSun;
        String namePlanet, namePlanetarySystem;
        Integer cont = 0,cont2=0;
        List<Planets> Planets = new ArrayList<>();
        Input in = new Input();

        while (create == true) {

            System.out.println("##-----------------------------------------##");
            System.out.println("Bienvenido al menu a continuacion tiene 3 opciones");
            System.out.println("Crear un sistema solar (Crear Planetas) : 1");
            System.out.println("Seleccionar un sistema solar (Calcular fuerza gravitacional entre planetas) : 2");
            System.out.println("Salir del programa : 0");
            int index = in.inputIndex("Ingresar numero del menu", 3);

            switch (index) {
                case 1 -> {
                    System.out.println("##---------------------------------------##");
                    System.out.println(
                            "Bienvenido a continuacion podra crear un sistema solar, empezando por los planetas");
                    System.out.println("Tendra que introducir los datos de cada planeta a crear.");
                    namePlanetarySystem = in.strInput("Lo primero sera darle nombre al sistema planetario:");
                    Planets.add(new Planets(cont));
                    while (conti) {
                        namePlanet = in.strInput("Coloque el nombre del planeta");
                        density = in.inputDouble("El valor de la densidad del planeta " + namePlanet + " es:");
                        dough = in.inputDouble("El valor de la masa del planeta " + namePlanet + " es:");
                        diameter = in.inputDouble("El valor de diametro del planeta " + namePlanet + " es:");
                        distanceToSun = in
                                .inputDouble(
                                        "El valor de la distancia entre el sol y el planeta " + namePlanet + " es:");

                        Planets.get(cont).addPlanet(cont2,
                                new Planet(density, dough, diameter, distanceToSun, namePlanet, cont2));
                        conti = Boolean.parseBoolean(in.inputBoolean("Desea continuar?"));
                        cont2++;
                    }
                    Planets.get(cont).printListPlanets();
                    cont++;
                }
                case 2 -> {
                    System.out.println("Los sistemas solares creados por ahora son: ");
                }
                case 0 -> {

                }
            }

        }
    }
}
