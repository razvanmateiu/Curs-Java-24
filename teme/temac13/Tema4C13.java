package teme.temac13;

import java.time.LocalDate;

public class Tema4C13 {
    //        -Print the date that will be after 10 days from today.
    public static void main(String[] args) {
        LocalDate dataLocala=LocalDate.now();
        System.out.println(dataLocala.plusDays(10));
    }


}
