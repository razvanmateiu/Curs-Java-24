package teme.temac10;

import java.util.Scanner;

public class Tema3C10 {
    public static void main(String[] args) {
//        -folosind un switch verificam daca variabila primita de la utilizator este mai mare decat 100.
//        Daca este adevarat afisam un mesaj.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti o valoare: ");
        int x = scanner.nextInt();
        int comp = 0;
        if (x > 100) comp = 1;
        switch (comp) {
            case 1:
                System.out.println("Numarul este mai mare de 100");
                break;
            case 0:
                System.out.println("Numarul nu este mai mare de 100");
                break;
        }
    }
}
