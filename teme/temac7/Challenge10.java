package teme.temac7;

import java.util.ArrayList;

public class Challenge10 {
    public static void main(String[] args) {
        //10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements to
        // listOne and assign listOne to listTwo. Now modify listOne by adding a new element.
        // Print both lists and observe the output.

        ArrayList<Integer> listOne = new ArrayList<Integer>();
        ArrayList<Integer> listTwo = new ArrayList<Integer>();

        listOne.add(10);
        listOne.add(20);
        listOne.add(30);

        System.out.println("listOne: " + listOne);
        listTwo = listOne;
        System.out.println("listTwo: " + listTwo);
        System.out.println("#####################");
        listOne.add(40);
        System.out.println("listOne (cu element adaugat): " + listOne);
    }
}


