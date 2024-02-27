package teme.temac8;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
//        Create a program where the user is prompted to guess a predefined number.
//        After each guess, the program should inform the user if the guess is too high or too low.
//        The program should keep prompting the user until they guess correctly.
//        Using a do-while loop, ensure the user is always asked at least once.
        int x = 13;
        Scanner scanner = new Scanner(System.in);
        int y;
        do {
            System.out.print("Ghiciti numarul: ");
            y = scanner.nextInt();
            if (y > x) System.out.println("Numarul e prea mare");
            if (y < x) System.out.println("Numarul e prea mic");
            if (y == x) System.out.println("Ati ghicit numarul!");
        } while (y != x);
    }
}
