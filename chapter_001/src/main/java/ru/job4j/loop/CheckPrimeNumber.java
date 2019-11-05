package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = true;
        for (int i = 2; i <= finish/2; i++) {
            int x = finish % i;
            if (x == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}
