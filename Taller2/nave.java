/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Taller2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author j_dbg
 */
public class Nave {

    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int index = 0;
        int numMotores;
        int altura;
        int cargaUtil;
        String mensaje, menLanza, combustible, name;
        int numMaxTripulantes;
        Boolean continuar = true;
        List<NaveA> naveAlist = new ArrayList<>();
        List<NaveB> naveBlist = new ArrayList<>();
        List<NaveC> naveClist = new ArrayList<>();
        List<NaveD> naveDlist = new ArrayList<>();

        Input in = new Input();

        while (continuar) {
            System.out.println("A continuacion de nave a crear: ");
            System.out.println("Nave A: 1");
            System.out.println("Nave B: 2");
            System.out.println("Nave C: 3");
            System.out.println("Nave D: 4");

            index = in.intInput("Ingrese el indice de la nave a crear: ");

            switch (index) {
                case 1 -> {
                    name = in.strInput("Ingrese el nombre de la nave: ");
                    numMotores = in.intInput("Ingrese el numero de motores: ");
                    altura = in.intInput("Ingrese la altura de la nave en m: ");
                    cargaUtil = in.intInput("Ingrese la carga util de la nave Toneladas: ");
                    numMaxTripulantes = in.intInput("Ingrese el numero maximo de tripulantes: ");
                    mensaje = in.strInput("Ingrese el mensaje a enviar: ");
                    menLanza = in.strInput("Introduzca procedimiento al lanzamiento: ");
                    combustible = in.strInput("El combustible a usar es: ");

                    NaveA naveA = new NaveA(numMotores, altura, cargaUtil, mensaje, name, numMaxTripulantes);
                    naveAlist.add(naveA);

                    System.out.println("El nombre de la nave es: " + naveAlist.get(x1).getName());
                    System.out.println("El numero de motores son: " + naveAlist.get(x1).getNumMotores());
                    naveAlist.get(x1).tipoCombustible(combustible);
                    System.out.println("El numero de altura son: " + naveAlist.get(x1).getAltura());
                    System.out.println("El numero de carga util son: " + naveAlist.get(x1).getCargaUtil());
                    System.out.println("El numero de mensaje son: " + naveAlist.get(x1).getMensaje());
                    System.out.println("El numero de numero maximo de tripulantes son: " + naveAlist.get(x1).getNumMaxTripulantes());
                    naveAlist.get(x1).lanzamiento(menLanza);

                    x1 += 1;
                    continuar = Boolean.parseBoolean(in.InputBoolean("Desea crear otra nave True/False: "));
                }
                case 2 -> {
                    Boolean Lanza;
                    name = in.strInput("Ingrese el nombre de la nave: ");
                    numMotores = in.intInput("Ingrese el numero de motores: ");
                    altura = in.intInput("Ingrese la altura de la nave en m: ");
                    cargaUtil = in.intInput("Ingrese la carga util de la nave Toneladas: ");
                    numMaxTripulantes = in.intInput("Ingrese el numero maximo de tripulantes: ");
                    mensaje = in.strInput("Ingrese el mensaje a enviar: ");
                    Lanza = Boolean.parseBoolean(in.InputBoolean("Preparar Lanzamiento:"));
                    combustible = in.strInput("El combustible a usar es: ");

                    NaveB naveB = new NaveB(numMotores, altura, cargaUtil, mensaje, name, numMaxTripulantes);
                    naveBlist.add(naveB);

                    System.out.println("El nombre de la nave es: " + naveBlist.get(x2).getName());
                    System.out.println("El numero de motores son: " + naveBlist.get(x2).getNumMotores());
                    naveBlist.get(x2).tipoCombustible(combustible);
                    System.out.println("El numero de altura son: " + naveBlist.get(x2).getAltura());
                    System.out.println("El numero de carga util son: " + naveBlist.get(x2).getCargaUtil());
                    System.out.println("El numero de mensaje son: " + naveBlist.get(x2).getMensaje());
                    System.out.println("El numero de numero maximo de tripulantes son: " + naveBlist.get(x2).getNumMaxTripulantes());
                    naveBlist.get(x2).lanzamiento(Lanza);

                    x2 += 1;
                    continuar = Boolean.parseBoolean(in.InputBoolean("Desea crear otra nave True/False: "));
                }
                case 3 -> {
                    name = in.strInput("Ingrese el nombre de la nave no tripulada: ");
                    numMotores = in.intInput("Ingrese el numero de motores: ");
                    altura = in.intInput("Ingrese la altura de la nave en m: ");
                    cargaUtil = in.intInput("Ingrese la carga util de la nave Toneladas: ");
                    mensaje = in.strInput("Ingrese el mensaje a enviar: ");
                    combustible = in.strInput("El combustible a usar es: ");
                    Boolean estado = Boolean.parseBoolean(in.InputBoolean("¿Cual es el estado de la nave? (True/False) "));

                    NaveC naveC = new NaveC(numMotores, altura, cargaUtil, mensaje, name);
                    naveClist.add(naveC);

                    System.out.println("El nombre de la nave es: " + naveClist.get(x3).getName());
                    System.out.println("El numero de motores son: " + naveClist.get(x3).getNumMotores());
                    naveClist.get(x3).tipoCombustible(combustible);
                    System.out.println("El numero de altura son: " + naveClist.get(x3).getAltura());
                    System.out.println("El numero de carga util son: " + naveClist.get(x3).getCargaUtil());
                    System.out.println("El numero de mensaje son: " + naveClist.get(x3).getMensaje());
                    naveClist.get(x3).estado(estado);

                    x3 += 1;
                    continuar = Boolean.parseBoolean(in.InputBoolean("Desea crear otra nave True/False: "));
                }
                case 4 -> {
                    Boolean Lanza;
                    name = in.strInput("Ingrese el nombre de la nave no tripulada: ");
                    numMotores = in.intInput("Ingrese el numero de motores: ");
                    altura = in.intInput("Ingrese la altura de la nave en m: ");
                    cargaUtil = in.intInput("Ingrese la carga util de la nave Toneladas: ");
                    mensaje = in.strInput("Ingrese el mensaje a enviar: ");
                    Lanza = Boolean.parseBoolean(in.InputBoolean("Preparar Lanzamiento:"));
                    combustible = in.strInput("El combustible a usar es: ");
                    Boolean estado = Boolean.parseBoolean(in.InputBoolean("¿Cual es el estado de la nave? (True/False) "));

                    NaveD naveD = new NaveD(numMotores, altura, cargaUtil, mensaje, name);
                    naveDlist.add(naveD);

                    System.out.println("El nombre de la nave es: " + naveDlist.get(x4).getName());
                    System.out.println("El numero de motores son: " + naveDlist.get(x4).getNumMotores());
                    naveDlist.get(x4).tipoCombustible(combustible);
                    System.out.println("El numero de altura son: " + naveDlist.get(x4).getAltura());
                    System.out.println("El numero de carga util son: " + naveDlist.get(x4).getCargaUtil());
                    System.out.println("El numero de mensaje son: " + naveDlist.get(x4).getMensaje());
                    naveDlist.get(x4).lanzamiento(Lanza);
                    naveDlist.get(x4).estado(estado);
                    x3 += 1;
                    continuar = Boolean.parseBoolean(in.InputBoolean("Desea crear otra nave True/False: "));
                }
            }
        }
    }
}
