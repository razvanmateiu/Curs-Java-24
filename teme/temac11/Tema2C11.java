package teme.temac11;

import java.util.Scanner;

public class Tema2C11 {
    public static void main(String[] args) {
//        -Create a Java program that uses a while loop to find the sum of numbers from 1 to n,
//        where n is a positive integer entered by the user.
        System.out.print("Introduceti un nr positiv >1: ");
        Scanner nr=new Scanner(System.in);
        int numar;
        int i=1;
        int suma=0;
        numar=nr.nextInt();
        while (i<=numar){
            suma=i+suma;
            ++i;
        }
        System.out.println("Suma numerelor de la 1 la "+numar+" este: "+suma);

    }
}
