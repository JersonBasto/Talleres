/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

import java.util.ArrayList;

/**
 *
 * @author j_dbg
 */
public class Frutas {

    public String name;
    public ArrayList<String> colors;
    private float averageWeight;

    public Frutas(String name, ArrayList<String> colors, float averageWeight) {
        this.name = name;
        this.colors = colors;
        this.averageWeight = averageWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
}
