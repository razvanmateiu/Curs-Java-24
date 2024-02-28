package teme.temac10;

public class Tema1C10 {
    public static void main(String[] args) {
//        -parcurgem un for care are indexul de la 1 la 1000.
//        Daca indexul=10 afisam un mesaj, daca indexul=100 afisam un al doilea mesaj,
//                daca  indexul este 900 afisam un al treilea mesaj.
        for(int i=1; i<=1000; ++i){
            if(i==10) System.out.println("Indexul a ajuns la 10");
            if(i==100) System.out.println("Indexul a ajuns la 100");
            if(i==900) System.out.println("Indexul a ajuns la 900");
        }
    }
}
