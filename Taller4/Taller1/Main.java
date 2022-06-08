package Taller4.Taller1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean create = true;
        Boolean conti = true;
        Double density, dough, diameter, distanceToSun;
        String namePlanet, namePlanetarySystem;
        Integer cont = 0, cont2 = 0;
        List<Planets> Planets = new ArrayList<>();
        List<PlanetarySystem> PlanetarySystem = new ArrayList<>();
        Input in = new Input();
        Scanner sc = new Scanner(System.in);
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
                    conti = true;
                    while (conti) {
                        namePlanet = in.strInput("Coloque el nombre del planeta");
                        density = in.inputDouble("El valor de la densidad del planeta " + namePlanet + " es:")
                                * Math.pow(10, in.intInput("con 10 a la:"));
                        dough = in.inputDouble("El valor de la masa del planeta " + namePlanet + " es:") *
                                Math.pow(10, in.intInput("con 10 a la:"));
                        diameter = in.inputDouble("El valor de diametro del planeta " + namePlanet + " es:") *
                                Math.pow(10, in.intInput("con 10 a la:"));
                        distanceToSun = 1000 * in.inputDouble(
                                "El valor de la distancia entre el sol y el planeta  " + namePlanet + " es:") *
                                Math.pow(10, in.intInput("con 10 a la:"));

                        Planets.get(cont).addPlanet(cont2,
                                new Planet(density, dough, diameter, distanceToSun, namePlanet, cont2));
                        conti = Boolean.parseBoolean(in.inputBoolean("Desea continuar?"));
                        cont2++;
                    }
                    System.out.println("##---------------------------------------##");
                    PlanetarySystem.add(new PlanetarySystem(namePlanetarySystem, Planets.get(cont)));
                    cont++;
                }
                case 2 -> {
                    System.out.println("Los sistemas solares creados por ahora son: ");
                    for (int x = 0; x < PlanetarySystem.size(); x++) {
                        PlanetarySystem.get(x).printPlanetarySystem(x);
                    }
                    index = in.inputIndex("Seleccione el indice del sistema planetario", PlanetarySystem.size());
                    System.out.println("Este Sistema contiene los siguientes planetas: ");
                    PlanetarySystem.get(index).printPlanetarySystemWithPlanets();
                    System.out.println(
                            "Seleccione dos planetas para realizar el calculo de la fuerza gravitacional, separada por (,): ");
                    String listPlanets = sc.nextLine();
                    Double distancePlanets = in.inputDouble("Distancia entre los dos planetas en m")
                            * Math.pow(10, in.intInput(" con 10 a la: "));
                    PlanetarySystem.get(index).gravitationalForce(listPlanets, distancePlanets);
                }
                case 0 -> {
                    create = false;
                }
            }

        }
    }
}
