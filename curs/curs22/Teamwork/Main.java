package curs.curs22.Teamwork;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);


        ListUpdater lista1=new ListUpdater();
        lista1.updateList(lista,1);

        System.out.println(lista.get(1));

        HashMap<String,String> listaEmployee=new HashMap<>();
        listaEmployee.put("23","Emil");
//        listaEmployee.d


    }
}
