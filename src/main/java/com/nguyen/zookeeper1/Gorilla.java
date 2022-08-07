package com.nguyen.zookeeper1;

import ch.qos.logback.core.net.SyslogOutputStream;

// USE extends on Subclasses
public class Gorilla extends Mammal{

    public void throwSomething() {
        System.out.println("Look out! The Gorilla is about to throw something!");
        setEnergyLevel(getEnergyLevel() - 5);
    }
    // print something thrown
    // decrease energy level

    public void eatBananas() {
        System.out.println("Yummy!");
        setEnergyLevel(getEnergyLevel() + 10);
    }
    // print happy gorilla
    // increase energy by 10


    public void climb() {
        System.out.println("The Gorilla is climbing th tree!");
        setEnergyLevel(getEnergyLevel() - 10);
    }
    // print climbing tree
    // reduce energy level by 10

}
