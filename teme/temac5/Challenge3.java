package teme.temac5;
import java.util.Scanner;
public class Challenge3 {
    public static void main(String[] argh) {
// Create a Java program where you increment and decrement the same variable.
// Display the value of the variable after each operation.
        Scanner ns= new Scanner(System.in);
        System.out.print("Introduceti valoarea: ");
        int x=ns.nextInt();
        if (x<0) System.out.print("Numarul introdus este negativ");
        if (x>0) System.out.print("Numarul introdus este positiv");
        if (x==0) System.out.print("Numarul introdus este 0");

    }
}