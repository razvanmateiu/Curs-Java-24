package curs.curs9;

import java.util.Scanner;

public class Teamwork {
    public static void main(String[] args) {

        /** Prima cerinta*/
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i);
        }
        /** A doua cerinta*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un nr: ");
        int numar = scanner.nextInt();

        int counterI = 0;
        int counterP = 0;

        for (int x = 1; x <= numar; ++x) {
            if (x % 2 == 0) ++counterP;
            else ++counterI;
        }

        System.out.println("Counter impare: " + counterI);
        System.out.println("Counter pare: " + counterP);

        /**A treia cerinta*/

        int y = 5;
        if (y > 10) System.out.println("Numarul e mai mare decat 10");
        else System.out.println("Numarul nu e mai mare decat 10");
    }

}
