package teme.temac5;

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] argh) {
//Create a Java program that demonstrates the use of each compound
//assignment operator with integers.
        Scanner ns = new Scanner(System.in);
        System.out.print("Introduceti primul numar (x):");
        int x = ns.nextInt();
        System.out.print("Introduceti al doilea numar (y):");
        int y = ns.nextInt();
        int a = x;
        int b = y;
        System.out.println("Valoarea calcului pentru x+=y: " + (a += b));
        a = x;
        b = y;
        System.out.println("Valoarea calcului pentru x-=y: " + (a -= b));
        a = x;
        b = y;
        System.out.println("Valoarea calcului pentru x*=y: " + (a *= b));
        a = x;
        b = y;
        System.out.println("Valoarea calcului pentru x/=y: " + (a /= b));
        a = x;
        b = y;
        System.out.println("Valoarea calcului pentru x%=y: " + (a %= b));
    }
}