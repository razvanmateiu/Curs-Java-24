package curs.curs21.Teamwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar=new Car();
        Vehicle myTruck=new Truck();
        System.out.println(myCar.fuelType());
        System.out.println(myTruck.fuelType());

        ArrayList<String> listaNoua=new ArrayList<>();
        listaNoua.add("Mere");
        listaNoua.add("Pere");
        listaNoua.add("Banane");

        ListRetriever listNouaP= new ListRetriever();
        System.out.println(listNouaP.retrieveElement(listaNoua,1));

    }
}
