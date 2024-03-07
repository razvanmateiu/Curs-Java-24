package curs.curs13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class Teamwork {
    public static void main(String[] args) {
//        -Write a program that prints the current date and time.
//                -Add 5 hours and 30 minutes to the current time and print it.
//        -From a given LocalDateTime, extract the date and time and print them separately.(methods: toLocalDate(), toLocalTime())
//        -Check if a given date-time is before or after the current date-time.(methods: LocalDateTime.of(), isBefore() )
//        -Convert a string representing date-time in the format yyyy-MM-dd HH:mm to LocalDateTime.
//                -Generate a random integer between 1 and 300.

        /*1*/
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        /*2*/

        LocalDateTime localDateTime1 = localDateTime.now();
        localDateTime1 = localDateTime1.plusHours(5).plusMinutes(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YY HH:mm");
        String formatDateTime = localDateTime1.format(formatter);
        System.out.println(formatDateTime);

        /*3*/
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.toLocalDate());
        System.out.println(localDateTime2.toLocalTime());

        /*4*/
        LocalDateTime dateTimeGiven = LocalDateTime.of(2024, 4, 14, 4, 25, 50);
        if (dateTimeGiven.isAfter(LocalDateTime.now())) System.out.println("The date is after the current Date");
        if (dateTimeGiven.isBefore(LocalDateTime.now())) System.out.println("The date is before the current Date ");

        /*5*/
        String data = "2024-05-01 23:23";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(data,formatter2);
        System.out.println(dateTime);

        /*6*/
        Random numarRandom = new Random();
        System.out.println(numarRandom.nextInt(1, 300));


    }
}
