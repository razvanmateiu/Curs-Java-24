package teme.temac8;


import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        //    Ask the user to enter a string. Print the reversed version of this string.

        String a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti cuvantul: ");
        a=scanner.next();
        int c=a.length();
        char[] l=new char[c];


        for (int i=0; i<c; ++i ){
            l[i]=a.charAt(i);
        }
        while (c>0){
            System.out.print(l[c-1]);
            --c;
        }

//        for (String part : a.split(" ")) {
//            System.out.print(new StringBuilder(part).reverse().toString());
//            System.out.print(" ");
//        }



    }


}
