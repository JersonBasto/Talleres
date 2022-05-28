/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author j_dbg
 */
public class Input {

    Scanner sc;

    public Input() {
        sc = new Scanner(System.in);
    }

    public String InputString(String mensaje) {
        String cadena = "";
        while (cadena.equals("")) {
            System.out.println(mensaje);
            cadena = sc.nextLine();
            if (!cadena.matches("^[a-zA-Z ]*$")) {
                System.out.println("Por favor ingrese letras del alfabeto");
                cadena = "";
            }
        }
        return cadena;
    }

    public String InputInt(String mensaje) {
        String entero = "";
        while (entero.equals("")) {
            System.out.println(mensaje);
            entero = sc.nextLine();
            if (!entero.matches("[0-9]*")) {
                System.out.println("Por favor ingrese un numero");
                entero = "";
            }
        }
        return entero;
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

    public Date InputDate(String mensaje) throws ParseException {
        int dd=0;
        int MM = 0;
        int YYYY=0;
        String date;
        Date dateFormat = null;
        System.out.println(mensaje);
        while (MM == 0) {
            System.out.println("Ingrese el mes de nacimiento");
            MM = sc.nextInt();
            if (MM < 0 || MM > 12) {
                System.out.println("El mes no se puede aceptar");
                MM = 0;
            }
        }
        while(dd==0){
            System.out.println("Ingrese el dia de nacimiento");
            dd=sc.nextInt();
            switch(MM){
                case 1->{
                    if (dd<0 || dd>31){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 2->{
                    if (dd<=0 || dd>28){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 3->{
                    if (dd<=0 || dd>31){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 4->{
                    if (dd<=0 || dd>30){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 5->{
                    if (dd<=0 || dd>31){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 6->{
                    if (dd<=0 || dd>30){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 7->{
                    if (dd<=0 || dd>31){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 8->{
                    if (dd<=0 || dd>31){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 9->{
                    if (dd<=0 || dd>30){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 10->{
                    if (dd<=0 || dd>31){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 11->{
                    if (dd<=0 || dd>30){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
                case 12->{
                    if (dd<=0 || dd>31){
                        System.out.println("dia no valido");
                        dd=0;
                    }
                }
            }
        }
        while(YYYY==0){
            System.out.println("Ingrese el año de nacimiento");
            YYYY= sc.nextInt();
            if(YYYY<1900){
                System.out.println("Fecha no valida");
                YYYY=0;
            }
        }
        date = Integer.toString(dd)+"/"+Integer.toString(MM)+"/"+Integer.toString(YYYY);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formatDate.parse(date));
        dateFormat=formatDate.parse(date);
        return dateFormat;
    }
    public String licensePlate(String mensaje){
        String licensePlate="";
        while(licensePlate.equals("")){
            System.out.println(mensaje);
            licensePlate= sc.nextLine();
            if(licensePlate.length()!=6){
                System.out.println("Debe ingresar una placa valida");
                licensePlate="";
            }
        }
        return licensePlate;
    }
}
