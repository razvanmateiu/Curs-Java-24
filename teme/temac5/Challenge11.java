package teme.temac5;
import java.util.Scanner;
public class Challenge11 {
    public static void main(String[] argh){
        Scanner ns= new Scanner(System.in);
        boolean a, b;
        System.out.print("Dati o valoare pt a (true/false): ");
        a=ns.nextBoolean();
        System.out.print("Dati o valoare pt b (true/false): ");
        b=ns.nextBoolean();

        System.out.println("Valoare !a: "+!a);
        System.out.println("Valoare !b: "+!b);

    }
}
