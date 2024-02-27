package teme.temac9;

import java.util.Locale;

public class Tema1C9 {
    public static void main(String[] args) {
//        -Create a program that defines a string variable with a value of "Hello".
//            Use nested if statements to first check if the length of the string is greater than 5.
//        If it is not, check if the string equals "Hello" and print the appropriate message in each case.
        String salut="Hello";
        if (salut.length()>5) System.out.println("Cuvantul are mai mult de 5 caractere");
        else if (salut=="Hello") System.out.println("Cuvantul este `Hello` ");
    }
}
