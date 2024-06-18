package curs.curs30.Teamwork;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] cuvinte = sentence.split(" ");
        String reverse = "";
        for (int i = cuvinte.length - 1; i >= 0; i--) reverse = reverse + " " + cuvinte[i];
        System.out.println(reverse);
    }
}
