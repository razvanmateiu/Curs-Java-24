package teme.temac10;

public class Tema2C10 {
    public static void main(String[] args) {
//        -rezolvam exercitiul de mai sus cu while si do while in loc de for.
        int i = 0;
        while (i <= 1000) {
            if (i == 10) System.out.println("Indexul a ajuns la 10");
            if (i == 100) System.out.println("Indexul a ajuns la 100");
            if (i == 900) System.out.println("Indexul a ajuns la 900");
            ++i;
        }
        i = 0;
        do {
            if (i == 10) System.out.println("Indexul a ajuns la 10");
            if (i == 100) System.out.println("Indexul a ajuns la 100");
            if (i == 900) System.out.println("Indexul a ajuns la 900");
            ++i;
        } while (i <= 1000);
    }
}

