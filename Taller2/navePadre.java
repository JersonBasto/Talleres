/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

/**
 *
 * @author j_dbg
 */
public abstract class navePadre {

    public int numMotores;
    public int altura;
    public int cargaUtil;
    public String mensaje, name;
    public int numMaxTripulantes;

    public abstract Boolean lanzamiento(Boolean lanzar);

    public int ingTripulantes(int ingreso) {
        return ingreso;
    }

    public int moverse(int mover) {
        return mover;
    }

    public String enviarMensaje(String mensaje) {
        return mensaje;
    }

    public navePadre(int numMotores, int altura, int cargaUtil, String mensaje, String name, int numMaxTripulantes) {
        this.name = name;
        this.numMotores = numMotores;
        this.altura = altura;
        this.cargaUtil = cargaUtil;
        this.mensaje = mensaje;
        this.numMaxTripulantes = numMaxTripulantes;
    }
    public navePadre(int numMotores, int altura, int cargaUtil, String mensaje, String name) {
        this.name = name;
        this.numMotores = numMotores;
        this.altura = altura;
        this.cargaUtil = cargaUtil;
        this.mensaje = mensaje;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getCargaUtil() {
        return cargaUtil;
    }

    public void setCargaUtil(int cargaUtil) {
        this.cargaUtil = cargaUtil;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumMaxTripulantes() {
        return numMaxTripulantes;
    }

    public void setNumMaxTripulantes(int numMaxTripulantes) {
        this.numMaxTripulantes = numMaxTripulantes;
    }
    
}
