/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author j_dbg
 */
public class Computers {
    public int memoryRam;
    public String processor;
    public String modelVideoCard;
    public int storageSize;
    public Boolean peripherals;

    public Computers(int memoryRam, String processor, String modelVideoCard, int storageSize, Boolean peripherals) {
        this.memoryRam = memoryRam;
        this.processor = processor;
        this.modelVideoCard = modelVideoCard;
        this.storageSize = storageSize;
        this.peripherals = peripherals;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getModelVideoCard() {
        return modelVideoCard;
    }

    public void setModelVideoCard(String modelVideoCard) {
        this.modelVideoCard = modelVideoCard;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public Boolean getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(Boolean peripherals) {
        this.peripherals = peripherals;
    }
    
    
}
