/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nave;

/**
 *
 * @author j_dbg
 */
public class NaveC extends navePadre implements naveInter {

    public NaveC(int numMotores, int altura, int cargaUtil, String mensaje, String name) {
        super(numMotores, altura, cargaUtil, mensaje, name);
    }

    @Override
    public Boolean lanzamiento(Boolean lanzar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tipoCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String tipoCombustible(String combustible) {
        System.out.println("El combustible a usar es: " + combustible);
        return combustible;
    }

    public void estado(Boolean estado) {
        if (estado) {
            System.out.println("La nave esta en orbita");
        } else {
            System.out.println("Se ha perdido la comunicacion con la nave");
        }
    }
}
