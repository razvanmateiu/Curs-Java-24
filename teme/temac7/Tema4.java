package teme.temac7;

import java.util.Scanner;

public class Tema4 {
    public static void main(String[] args){
        /*Create a simple program that takes a number as
        input and uses if-else statements to categorize the number as "positive,"
         "negative," or "zero."
          */
        Scanner ns=new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int a=ns.nextInt();
        if (a==0) {
            System.out.println("Numarul introdus este 0");
        } else if (a>0) {
            System.out.println("Numarul introdus este positiv");
        } else System.out.println("Numarul introdus este negativ");
    }
}
