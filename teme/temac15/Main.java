package teme.temac15;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        -Add 5 hours and 30 minutes to the current time and print it.
//        -From a given LocalDateTime, extract the date and time and print them separately.
//        -Generate a random integer between 1 and 100.
//        -Choose a random element from the array {"apple", "banana", "cherry", "date"}.
//        -Create an ArrayList and add 5 elements to it. Determine and print the size of the ArrayList.

        /*1*/
        LocalTime time = LocalTime.now();
        System.out.println(time.plusHours(5).plusMinutes(30));

        /*2*/
        LocalDateTime now = LocalDateTime.of(20024, 5, 1, 20, 10);
        System.out.println(now.toLocalDate());
        System.out.println(now.toLocalTime());

        /*3*/
        Random nrRandom=new Random();

        System.out.println(nrRandom.nextInt(1,100));
        /*4*/
        String[] list={"apple","banana","cherry","date"};
        System.out.println(list[nrRandom.nextInt(1, list.length)]);

        /*5*/
        ArrayList list1=new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        System.out.println(list1.size());
    }
}
