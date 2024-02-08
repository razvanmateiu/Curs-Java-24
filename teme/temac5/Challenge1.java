package teme.temac5;
import java.util.Scanner;
public class Challenge1 {
    public static void main(String[] argh){
//Write a Java program to take two numbers as input and display
//the result of addition, subtraction, multiplication, division, and modulus.
        Scanner ns= new Scanner(System.in);
        System.out.print("Introduceti primul numar:");
        int x=ns.nextInt();
        System.out.print("Introduceti al doilea numar:");
        int y=ns.nextInt();

        System.out.println("Adunarea numerelor este: "+(x+y));
        System.out.println("Scaderea numerelor este: "+(x-y));
        System.out.println("Inmultirea numerelor este: "+(x*y));
        System.out.println("Impartirea numerelor este: "+(x/y));
        System.out.println("Modulus "+(x%y));
        System.out.println();
        
//Write a program that calculates the area of a rectangle.
//Take the length and breadth as inputs.
        System.out.println("Calculul ariei unui dreptunghi: ");

        System.out.print("Introduceti valoarea laturei a: ");
        int a=ns.nextInt();
        System.out.print("Introduceti valoarea laturei b: ");
        int b=ns.nextInt();

        System.out.println("Valoarea ariei dpretunghiului este: "+(a*b));

    }
}
