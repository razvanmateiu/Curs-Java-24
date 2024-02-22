package teme.temac8;

import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args) {
//        Create a program that takes three numbers as input and print the largest number among them.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul 1: ");
        int nr1 = scanner.nextInt();
        System.out.print("Introduceti numarul 2: ");
        int nr2 = scanner.nextInt();
        System.out.print("Introduceti numarul 3: ");
        int nr3 = scanner.nextInt();

        if (nr1>nr2 && nr1>nr3) System.out.println("Cel mai mare numar este: "+nr1);
        else if (nr2 > nr1 && nr2 > nr3) {
            System.out.println("Cel mai mare numar este: "+nr2);
        } else System.out.println("Cel mai mare numar este: "+nr3);

    }
}
