package teme.temac7;

public class Tema3 {
    public static void main(String[] args) {
        /*Create a Java program where you define an integer variable with a value of 75.
        Use an if-else-if ladder to check the range in which the number falls. Use the ranges 0-50,
        51-100, and 101-150, and print a message for each range specifying which range the number falls into.
        */
        int x = 75;
        if (0 <= x && x <= 50) {
            System.out.println("Numarul se afla in rangeul 0-50");
        } else if (50 < x && x <= 100) {
            System.out.println("Numarul se afla in rangeul 51-100");
        } else if (100 < x && x <= 150) {
            System.out.println("Numarul se afla in rangeul 101-150");
        }

    }
}
