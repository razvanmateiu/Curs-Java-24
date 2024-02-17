package teme.temac7;

import java.util.Scanner;

public class Challenge19 {
    public static void main(String[] args) {
        //19. Write a Java program that takes an integer variable age as input.
        // Use a ternary operator to classify the person into one of the following categories:
        // "Child" (age < 12), "Teenager" (age between 12 and 17),
        // "Adult" (age between 18 and 64), and "Senior" (age 65 and above). Print the resulting classification.
        Scanner n = new Scanner(System.in);
        System.out.print("Age: ");
        int age = n.nextInt();
        boolean x=false;
        x = (age < 12) ? true : false;
        if (x) System.out.println("Child");

        x=(12<=age && age<=17) ? true : false;
        if (x) System.out.println("Teenager");

        x=(18<=age && age<64) ? true : false;
        if (x) System.out.println("Adult");

        x=(age>=64) ? true : false;
        if (x) System.out.println("Senior");


    }
}
