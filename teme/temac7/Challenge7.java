package teme.temac7;

public class Challenge7 {
    public static void main(String[] args) {
        //7.Write a Java program that determines the type of a triangle based on its sides.
        // Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
        // Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
        int sideOne = 20;
        int sideTwo = 10;
        int sideThree = 30;

        boolean e = false;
        boolean i = false;
        boolean s = false;

        if (sideOne == sideThree && sideOne == sideTwo) {
            e = !e;
            System.out.println("Triunghiul e echilateral");
        }

        if (sideOne == sideThree || sideTwo == sideOne || sideThree == sideTwo) {
            if (e == false) {
                i = !i;
                System.out.println("Triunghiul e isoscel");
            }
        }

        if (e == false && i == false) System.out.println("Triunghiul e scalene");


    }
}


