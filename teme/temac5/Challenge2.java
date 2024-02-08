package teme.temac5;
import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] argh) {
// Create a Java program where you increment and decrement the same variable.
// Display the value of the variable after each operation.
        Scanner ns= new Scanner(System.in);
        System.out.print("Introduceti valoarea: ");
        int x=ns.nextInt();
        System.out.println("Valoarea incrementata este: "+(++x));
        x=--x;
        System.out.println("Valoarea decrementata este: "+(--x));

    }
}