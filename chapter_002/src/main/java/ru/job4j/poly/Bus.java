package ru.job4j.poly;

public class Bus implements Transport {

    public void ride() {
        System.out.println("Ride on road");
    }
    public void volume(int passengers) {
        passengers = 33;
    }
    public int refueling(int gas) {
        int cost = 2;
        gas = 50;
        return cost * gas;
    }
}
