/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author j_dbg
 */
public class Carros {
    private int modelCar;
    protected String licensePlate;
    public String makeCar;
    public String colorCar;

    public Carros(int modelCar, String licensePlate, String makeCar, String colorCar) {
        this.modelCar = modelCar;
        this.licensePlate = licensePlate;
        this.makeCar = makeCar;
        this.colorCar = colorCar;
    }

    public int getModelCar() {
        return modelCar;
    }

    public void setModelCar(int modelCar) {
        this.modelCar = modelCar;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMakeCar() {
        return makeCar;
    }

    public void setMakeCar(String makeCar) {
        this.makeCar = makeCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }
    
    
}
