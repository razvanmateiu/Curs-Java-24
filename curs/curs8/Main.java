package curs.curs8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*      Person persoana1 = new Person();
        persoana1.name = "Alex";
        persoana1.age = 20;
        Person persoana2 = new Person();
        persoana2.name = "Alex2";
        persoana2.age = 22;

        System.out.println("Varsta este: " + persoana1.age);
        if (persoana1.age == persoana2.age) {
            System.out.println("Varsta este aceeasi");

        } else System.out.println("Varsta este diferita");

        Person persoana3 = new Person("Alex", 20);
        System.out.println(persoana3.age);

        Scanner scanner=new Scanner(System.in);
        int numarUtilizator =scanner.nextInt();
        System.out.println(numarUtilizator);
 */

        Contract contract1=new Contract("public","electronica",2000);
        Contract contract2=new Contract("privat","electronic",2005);
        Contract contract3=new Contract("public","electronica",2020);

        Bloc bloc1=new Bloc(true,2005,7);
        Bloc bloc2=new Bloc(false,1989,4);
        Bloc bloc3=new Bloc(true,1995,12);

        Masina masina1=new Masina("verde",2005,"M1");
        Masina masina2=new Masina("rosie",2020,"M2");
        Masina masina3=new Masina("neagra",2021,"M3");

        if(masina1.anFabricatie>2020) System.out.println("Masina 1 este noua");
        if(masina2.anFabricatie>2020) System.out.println("Masina 2 este noua");
        if(masina3.anFabricatie>2020) System.out.println("Masina 3 este noua");
    }
}
