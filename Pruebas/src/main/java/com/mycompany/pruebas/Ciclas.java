/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebas;


/**
 *
 * @author j_dbg
 */
public class Ciclas {
    public String color;
    private Boolean Electric;
    private Boolean motor;
    private String model;

    public Ciclas(String color, Boolean Electric, Boolean motor, String model) {
        this.color = color;
        this.Electric = Electric;
        this.motor = motor;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getElectric() {
        return Electric;
    }

    public void setElectric(Boolean Electric) {
        this.Electric = Electric;
    }

    public Boolean getMotor() {
        return motor;
    }

    public void setMotor(Boolean motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
}
