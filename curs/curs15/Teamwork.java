package curs.curs15;

import java.util.ArrayList;

public class Teamwork {
    public static void main(String[] args) {
        ArrayList<String> fructe=new ArrayList<>();
        fructe.add("Grape");
        fructe.add("Grapefruit");
        fructe.add("Banana");

        fructe.remove(2);

        System.out.println(fructe.contains("Grape"));

//        fructe.clear();

        fructe.add(1,"Mango");
        fructe.remove(0);
        fructe.add(0,"Penguin");

        for (String fruct:fructe){
            System.out.println(fruct);

        }






    }
}
