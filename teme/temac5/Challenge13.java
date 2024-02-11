package teme.temac5;
import java.util.Scanner;
public class Challenge13 {
    public static void main(String[] argh) {
//  Write a program to calculate the price after discount. Take the original
//  price and discount percentage as input. Use compound assignment operator to
//  perform the calculation.
        Scanner ns= new Scanner(System.in);
        System.out.print("Introduceti pretul: ");
        int x=ns.nextInt();
        System.out.print("Introduceti valoarea discountului(%): ");
        int y=ns.nextInt();
        int a=x-(x*y)/100;

        //y/=100;
        //y*=x;
        //x-=y;

        System.out.println("Pretul cu discount este: "+a);
    }
}