package teme.temac9;

public class Tema3C9 {
    //    -Create a program that defines a string variable with a value of "Winter".
//    Use a switch statement to print a message for each season ("Winter", "Spring", "Summer", "Autumn").
//    For "Winter", print "It's cold"; for "Spring", print "Flowers bloom";
//    for "Summer", print "It's hot"; for "Autumn", print "Leaves fall".
    public static void main(String[] args) {
        String anotimp = "Winter";

        switch (anotimp) {
            case "Winter":
                System.out.print("It´s cold");
                break;
            case "Spring":
                System.out.print("Flowers bloom");
                break;
            case "Summer":
                System.out.print("It´s hot");
                break;
            case "Autum":
                System.out.print("Leaves fall");
                break;
        }
    }
}
