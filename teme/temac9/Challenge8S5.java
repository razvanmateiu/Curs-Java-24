package teme.temac9;


public class Challenge8S5 {
    public static void main(String[] args) {
//        Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print(fib[0] + "  ");
        System.out.print(fib[1] + "  ");

        for (int i = 2; i <= 9; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + "  ");
        }

    }
}

