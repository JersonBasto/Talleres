/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

/**
 *
 * @author j_dbg
 */
public class NaveA extends navePadre implements naveInter {

    public NaveA(int numMotores, int altura, int cargaUtil, String mensaje, String name, int numMaxTripulantes) {
        super(numMotores, altura, cargaUtil, mensaje, name, numMaxTripulantes);
    }

    @Override
    public Boolean lanzamiento(Boolean lanzar) {
        return lanzar;
    }

    public String lanzamiento(String lanzar) {
        System.out.println("Procedimiento a despegar: " + lanzar);
        return lanzar;
    }

    @Override
    public void tipoCombustible() {

    }

    public String tipoCombustible(String combustible) {
        System.out.println("El combustible a usar es: " + combustible);
        return combustible;
    }
}
