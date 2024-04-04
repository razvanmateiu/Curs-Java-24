package curs.curs21;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        List<String> curs=new ArrayList<>();
        curs.add("Curs1");
        curs.get(0);



        HashMap <Integer,String> hashMapNotaCurs=new HashMap<Integer, String>();
        hashMapNotaCurs.put(10, "Curs 1");
        hashMapNotaCurs.put(11,"Curs 2");
        hashMapNotaCurs.put(8,"Curs 3");

        System.out.println(hashMapNotaCurs.get(8));

        for (Integer nota:hashMapNotaCurs.keySet()){
            System.out.println(hashMapNotaCurs.get(nota));
        }

    }
}
