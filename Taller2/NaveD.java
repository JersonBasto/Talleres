/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nave;

/**
 *
 * @author j_dbg
 */
public class NaveD extends navePadre implements naveInter{

    public NaveD(int numMotores, int altura, int cargaUtil, String mensaje, String name) {
        super(numMotores, altura, cargaUtil, mensaje, name);
    }
    @Override
    public void tipoCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public Boolean lanzamiento(Boolean lanzar) {
        System.out.println("Prepararse para lanzamiento : " + lanzar);
        return lanzar;
    }
    
    public String tipoCombustible(String combustible) {
        System.out.println("El combustible a usar es: " + combustible);
        return combustible;
    }
    
    public void estado(Boolean estado) {
        if (estado) {
            System.out.println("La nave esta en proceso de despegue");
        } else {
            System.out.println("La nave no ha iniciado el despegue");
        }
    }
}
