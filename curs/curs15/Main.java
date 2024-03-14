package curs.curs15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> numeMasini = new ArrayList<>();
        numeMasini.add("Masina1");
        numeMasini.add("Masina2");
        numeMasini.add("Masina3");



        /*Shopping cart*/
        List<Product> cart = new ArrayList<>();
        Product produs1 = new Product("Ciocolata", 15.99);
        Product produs2 = new Product("Branza", 30.99);
        Product produs3 = new Product("Laptop", 999.99);

        double sumaPret = 0;
        cart.add(produs1);
        cart.add(produs2);
        cart.add(produs3);

        for (Product produs : cart) {
            sumaPret += produs.price;
        }
        System.out.println(sumaPret);


        System.out.print("Numiti un produs: ");
        Scanner scanner = new Scanner(System.in);
        String produsNumit = scanner.next();


        for (Product fruct : cart) {
            if (fruct.name.equals(produsNumit)) {
                cart.remove(fruct);
                break;
            }
        }
        for (Product fruct:cart){
            System.out.print(fruct.name+" ");
        }

        System.out.println();



//        cart.remove(produs1);

        System.out.println("Am sters produsul?" + cart.isEmpty());


    }

}
