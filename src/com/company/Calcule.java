package com.company;

/**
 * Created by iulianafestila on 7/30/2018.
 */
public class Calcule {

    public int adunare(int x, int y) {
        return x + y;
    }

    public int scadere(int x, int y) {
        return x - y;
    }

    public int inmultire(int x, int y) {
        return x * y;
    }

    public int impartire(int x, int y) {
        return x / y;
    }

    public int modulo(int x, int y) {
        return x % y;
    }

    public int ridicareLaPutere(int x, int y) {
        int a=1;
        for (int i=1; i<=y; i++){
            a=a*x;
        }
        return a;
    }

    public double radical(double x) {
        x = Math.sqrt(x);
        return x;
    }
}
