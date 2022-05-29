/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

import java.util.Scanner;

/**
 *
 * @author j_dbg
 */
public class Input {

    Scanner sc = new Scanner(System.in);

    public int intInput(String mensaje) {
        int inte = 0;
        String recoger;
        while (inte == 0) {
            System.out.println(mensaje);
            recoger = sc.nextLine();
            if (!recoger.matches("[0-9]*")) {
                System.err.println("Por favor escriba un numero");
                inte = 0;
            } else {
                inte = Integer.parseInt(recoger);
            }
        }
        return inte;
    }

    public String strInput(String mensaje) {
        String str = "";
        while (str.equals("")) {
            System.out.println(mensaje);
            str = sc.nextLine();
            if (!str.matches("^[a-zA-Z ]*$")) {
                System.err.println("Ingrese caracteres alfabeticos");
                str = "";
            }
        }
        return str;
    }

    public String InputBoolean(String mensaje) {
        String estado = "";
        while (estado.equals("")) {
            System.out.println(mensaje);
            estado = sc.nextLine().toUpperCase();
            switch (estado) {
                case "FALSE" ->
                    estado = "false";
                case "TRUE" ->
                    estado = "true";
                default -> {
                    System.out.println("Ingrese True o false");
                    estado = "";
                }
            }
        }
        return estado;
    }
}
