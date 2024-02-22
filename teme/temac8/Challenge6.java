package teme.temac8;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
//        Write a program that asks the user to enter numbers.
//        The program should continue prompting the user until they enter -1.
//        After they enter -1, print the sum of all numbers entered (excluding -1).
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nr = 0;
        System.out.print("Introduceti un numar: ");
        int first = scanner.nextInt();
        if (first != -1) {
            sum = first;
            while (nr != -1) {
                sum = sum + nr;
                System.out.print("Mai introduceti un numar: ");
                nr = scanner.nextInt();

            }
        }
        System.out.println("Suma este: " + sum);

    }
}
