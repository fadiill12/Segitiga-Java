package com.tugas;

public class Segitiga {

    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
