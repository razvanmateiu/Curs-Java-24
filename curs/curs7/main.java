package curs.curs7;

public class main {
    public static void main(String[] args) {
        System.out.println("Start");

        System.out.println(3 == 3.000);

        /** Creare obiect => instantiere*/

        Animal animalObiect = new Animal();
        Animal pisica = new Animal();
        Animal caine = new Animal();

        Animal soarece=pisica;

        System.out.println(pisica==soarece);
        System.out.println(caine==soarece);


    }
}
