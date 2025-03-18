package com.tugas;
import java.util.*;

public class Main {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- LUAS SEGITIGA ----------");
        System.out.print("MASUKAN ALAS SEGITIGA\t\t= ");
        double alas = scanner.nextDouble();
        System.out.print("MASUKAN TINGGI SEGITIGA\t\t= ");
        double tinggi = scanner.nextDouble();

        Segitiga segitiga = new Segitiga(alas, tinggi);
        System.out.println("LUAS SEGITIGA ADALAH\t\t= " + segitiga.hitungLuas());
        System.out.println("---------- LUAS SEGITIGA ----------");

    }
}
