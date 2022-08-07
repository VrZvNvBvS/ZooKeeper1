package com.nguyen.zookeeper1;

public class Mammal {
    // member variable
    private int energyLevel;

    // constructor access level, implicit return, same name as class
    public Mammal() {
        energyLevel = 100;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }


        // access level, return
    public void displayEnergyLevel() {
        System.out.println(energyLevel);
    }
}