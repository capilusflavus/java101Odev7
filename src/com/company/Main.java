package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00, toplam;
        double armutkg, elmakg, domateskg, muzkg, patlıcankg;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutkg = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmakg = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domateskg = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muzkg = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcankg = scanner.nextDouble();
        toplam = (armut * armutkg) + (elma * elmakg) + (domates * domateskg) + (muz * muzkg) + (patlıcan * patlıcankg);
        System.out.print("Toplam Tutar : " + toplam + " TL");

    }
}
