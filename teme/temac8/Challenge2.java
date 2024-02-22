package teme.temac8;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
//        Write a program that asks the user to enter a number between 1 and 12.
//        Print the name of the corresponding month or "Invalid Month" if out of range.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int nr = scanner.nextInt();
        switch (nr) {
            case 1 -> System.out.println("Ianuarie");
            case 2 -> System.out.println("Februarie");
            case 3 -> System.out.println("Martie");
            case 4 -> System.out.println("Aprilie");
            case 5 -> System.out.println("Mai");
            case 6 -> System.out.println("Iunie");
            case 7 -> System.out.println("Iulie");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("Septembrie");
            case 10 -> System.out.println("Octombrie");
            case 11 -> System.out.println("Noiembrie");
            case 12 -> System.out.println("Decembrie");
        }
    }


}

