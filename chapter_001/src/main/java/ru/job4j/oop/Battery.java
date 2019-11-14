package ru.job4j.oop;

public class Battery {
    private int charge;

    public Battery(int charge) {
        this.charge = charge;
    }

    public void exchange(Battery another) {
        another.charge = this.charge + another.charge;
        this.charge = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(80);
        Battery battery2 = new Battery(20);
        System.out.println("Заряд1 : " + battery1.charge + ". Заряд2 : " + battery2.charge);
        battery2.exchange(battery1);
        System.out.println("Заряд1 : " + battery1.charge + ". Заряд2 : " + battery2.charge);
    }
}
