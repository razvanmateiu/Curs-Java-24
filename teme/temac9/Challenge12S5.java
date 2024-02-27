package teme.temac9;

import java.util.Scanner;

public class Challenge12S5 {
    public static void main(String[] args) {
//        12. Continue Statement
//        Create a program that asks the user for 10 numbers.
//        Print the sum of all numbers that are greater than 5. If the user enters a number less than or equal to 5,
//        use the continue statement to skip the addition for that number.
        int[] numere = new int[10];
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; ++i) {
            System.out.print("Introduceti numarul " + (i+1) + " :");
            numere[i] = scanner.nextInt();
            if (numere[i] <= 5) continue;
            else suma = suma + numere[i];
        }
        System.out.println("Suma numerelor mai mari de 5 este: " + suma);
    }
}
