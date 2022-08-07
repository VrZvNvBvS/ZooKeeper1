package com.nguyen.zookeeper1;

public class ZooTest {
    public static void main(String[] args) {

        //  instantiate Gorilla
        Gorilla gorilla = new Gorilla();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        gorilla.eatBananas();
        gorilla.eatBananas();

        gorilla.climb();

        gorilla.displayEnergyLevel();

    }
}
