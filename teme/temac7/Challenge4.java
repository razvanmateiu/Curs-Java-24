package teme.temac7;

public class Challenge4 {
    public static void main(String[] args) {
        //Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
        // Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.

        int heightOne = 150;
        int heightTwo = 160;
        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;

        System.out.println(maximumHeight);

/** Math.max()*/
        System.out.println("############################");
        int maximumHeight2=Math.max(heightOne, heightTwo);
        System.out.println(maximumHeight2);

    }
}