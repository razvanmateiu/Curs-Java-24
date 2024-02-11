package teme.temac5;

import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] argh){
        //Write a program that calculates the area of a rectangle.
        //Take the length and breadth as inputs.
        Scanner ns= new Scanner(System.in);
        System.out.println("Calculul ariei unui dreptunghi: ");

        System.out.print("Introduceti valoarea laturei a: ");
        int a=ns.nextInt();
        System.out.print("Introduceti valoarea laturei b: ");
        int b=ns.nextInt();

        System.out.println("Valoarea ariei dpretunghiului este: "+(a*b));

    }

}
