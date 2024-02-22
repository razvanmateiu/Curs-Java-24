package teme.temac8;

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
//        Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul n: ");
        int n = scanner.nextInt();
        int[] fib = new int[n];

        if (n > 1) {
            fib[0] = 0;
            fib[1] = 1;
            System.out.print(fib[0] + "  ");
            System.out.print(fib[1] + "  ");

            for (int i = 2; i < n; ++i) {
                fib[i] = fib[i - 1] + fib[i - 2];
                System.out.print(fib[i] + "  ");
            }
        }

    }
}
