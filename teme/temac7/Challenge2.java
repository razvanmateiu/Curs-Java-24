package teme.temac7;

public class Challenge2 {
    public static void main(String[] args) {
        //2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
        // Use an equality operator
        // to compare these two numbers and print the result. Do the same for two String objects firstString
        // and secondString with the same value, but use the equals() method for comparison. Print the result.
        int firstNumber = 13;
        int secondNumber = 25;

        System.out.println(firstNumber == secondNumber);

        String firstString = "OpenAI";
        String secondString = "OpenAI";

        System.out.println(firstString.equals(secondString));

        System.out.println(firstString == secondString);

    }
}
