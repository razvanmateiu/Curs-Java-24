package curs.curs14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] listaDeFructe = {"Mar", "Para", "Banana"};
        Arrays.sort(listaDeFructe);
        for (String fruct : listaDeFructe) {
            System.out.println(fruct);
        }
        System.out.println("Mai sus am sortarea pentru listaDeFructe");
        String[] listaDeFructeTryCopy = listaDeFructe;
        Arrays.sort(listaDeFructeTryCopy, Comparator.reverseOrder());
        for (String fruct : listaDeFructe) {
            System.out.println(fruct);
        }

        /*Static*/
//        Contract contract=new Contract();
//        contract.metodaContract();
//        Contract.metodaContract();
        /*ArrayList*/
        ArrayList arrayList1=new ArrayList<>();

        Bloc bloc1=new Bloc(4,"A",5,true);
        Apartament apartament1=new Apartament(1,1,5,false);
        Masina masina1=new Masina("verde","mazda",4,3);

    }
}
