package teme.temac9;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge11S5 {
    //    11. Break Statement
//    Write a program that prompts the user to enter numbers.
//    Calculate the average of these numbers. If the user enters 0, break out of the input loop and then
//    print the average of the numbers entered so far.
    public static void main(String[] args) {
        ArrayList<Integer> numere = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int numar;
        do {
            System.out.print("Introduceti un numar: ");
            numar = scanner.nextInt();
            if (numar == 0) break;
            else numere.add(numar);
        } while (true);
        int counter = numere.size();
        int suma = 0;
        for (int i = 0; i < counter; ++i) {
            suma = suma + numere.get(i);
        }
        System.out.println("Media este: " + suma / counter);
    }
}
