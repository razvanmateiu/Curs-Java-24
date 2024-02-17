package teme.temac7;

public class Tema2{
    /*
    Create a program that defines a string variable with a value of "Hello".
    Use nested if statements to first check if the length of the string is greater than 5.
    If it is not, check if the string equals "Hello" and print the appropriate message in each case.
     */
    public static void main(String[] args) {


        String str = "Hello";
        int x = str.length();

        if (x > 5) {
            System.out.println("Mesajul are mai mult de 5 caractere");
        } else if (str == "Hello") {
            System.out.println("Stringul este Hello");
        }
    }
}
