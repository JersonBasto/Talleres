package Taller4.Taller4;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Input {

    Scanner sc = new Scanner(System.in);

    public int intInput(String mensaje) {
        int inte = -1;
        String recoger;
        while (inte == -1) {
            System.out.println(mensaje);
            recoger = sc.nextLine();
            if (!recoger.matches("[0-9]*")) {
                System.err.println("Por favor escriba un numero");
                inte = -1;
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

    public String inputBoolean(String mensaje) {
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

    public Integer inputIndex(String mensaje, int indexSize) {
        int inte = -1;
        String recoger;
        while (inte == -1) {
            System.out.println(mensaje);
            recoger = sc.nextLine();
            if (!recoger.matches("[0-9]*")) {
                System.err.println("Por favor escriba un numero");
                inte = -1;
            } else {
                inte = Integer.parseInt(recoger);
                if (inte > indexSize - 1 || inte < 0) {
                    System.err.println("El numero esta fuera de rango, introduzca un numero valido");
                    inte = -1;
                }
            }
        }
        return inte;
    }

    public Double inputDouble(String mensaje) {
        Double inDouble = 0.0;
        String str = "";
        System.out.println(mensaje);
        while (inDouble == 0.0) {
            str = sc.nextLine();
            if (!str.matches("[0-9]*.[0-9]*")) {
                System.out.println("Coloque un numero para el dato");
                inDouble = 0.0;
            } else {
                inDouble = Double.parseDouble(str);
            }
        }
        return inDouble;
    }

    public Date InputDate(String mensaje) throws ParseException {
        int dd = 0;
        int MM = 0;
        int YYYY = 0;
        String date;
        Date dateFormat = null;
        System.out.println(mensaje);
        while (MM == 0) {
            System.out.println("Ingrese el mes de Matriculacion");
            MM = sc.nextInt();
            if (MM < 0 || MM > 12) {
                System.out.println("El mes no se puede aceptar");
                MM = 0;
            }
        }
        while (dd == 0) {
            System.out.println("Ingrese el dia de Matriculacion");
            dd = sc.nextInt();
            switch (MM) {
                case 1 -> {
                    if (dd < 0 || dd > 31) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 2 -> {
                    if (dd <= 0 || dd > 28) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 3 -> {
                    if (dd <= 0 || dd > 31) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 4 -> {
                    if (dd <= 0 || dd > 30) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 5 -> {
                    if (dd <= 0 || dd > 31) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 6 -> {
                    if (dd <= 0 || dd > 30) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 7 -> {
                    if (dd <= 0 || dd > 31) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 8 -> {
                    if (dd <= 0 || dd > 31) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 9 -> {
                    if (dd <= 0 || dd > 30) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 10 -> {
                    if (dd <= 0 || dd > 31) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 11 -> {
                    if (dd <= 0 || dd > 30) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
                case 12 -> {
                    if (dd <= 0 || dd > 31) {
                        System.out.println("dia no valido");
                        dd = 0;
                    }
                }
            }
        }
        while (YYYY == 0) {
            System.out.println("Ingrese el año de Matriculacion");
            YYYY = sc.nextInt();
            if (YYYY < 1900) {
                System.out.println("Fecha no valida");
                YYYY = 0;
            }
        }
        date = Integer.toString(dd) + "/" + Integer.toString(MM) + "/" + Integer.toString(YYYY);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formatDate.parse(date));
        dateFormat = formatDate.parse(date);
        return dateFormat;
    }
}
