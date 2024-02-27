package curs.curs10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        /**exemplu continue*/
//
///*        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            *//**Par*//*
//            if (i % 2 == 0) {
//                System.out.println("Am gasit numar par: " + i);
//                continue;
//            }
//            *//**nu mai ajunge aici dupa continue*//*
//            System.out.println("Am trecut de continue");
//        }*/
//        String variabliaSirCaractere="Ceva;";
//        System.out.println(variabliaSirCaractere.length());
//        System.out.println(1+2+3);
//        System.out.println(1+2+"ab");
//        System.out.println("ab"+1+2+"ab");
//
//        String denumireCurs="Curs Java!";
//        String denumireCurs2= "Curs Java!";

//        for (int i = 10; i <= 10; --i) {
//           if (i==3) { System.out.println("Indexul a ajuns la valoarea 3");
//           break;
//        }
//    }
        Bloc bloc1 = new Bloc("A", 5, 20, true);
        Bloc bloc2 = new Bloc("B", 9, 40, false);
        Bloc bloc3 = new Bloc("A", 2, 4, false);
        Bloc bloc4 = new Bloc("A", 8, 16, true);

        System.out.println("Pentru blocul 1 avem " + bloc1.getEtaje());
        System.out.println("Pentru blocul 2 avem " + bloc2.getEtaje());
        System.out.println("Pentru blocul 3 avem " + bloc3.getEtaje());
        System.out.println("Pentru blocul 4 avem " + bloc4.getEtaje());
    }

}

