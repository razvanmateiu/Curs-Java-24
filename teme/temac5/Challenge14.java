package teme.temac5;
import java.util.Scanner;
public class Challenge14 {
    public static void main(String[] argh) {

//14. Create a program that checks if a user entered number is within
// a specific range (e.g., 1-100). Use relational operators for the checks.
        Scanner ns = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int x = ns.nextInt();
        if (x<=100 && x>=0) {
            System.out.print("Numarul e in rageul 1-100: ");
        }
            else {
            System.out.print("Numarul nu e in rageul 1-100: ");
        }


    }
}