package curs.curs12;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String denumireFirma = "Curs.Inc";
        denumireFirma = "Altadenumire.Inc";

        StringBuilder denumireContract = new StringBuilder("Contract studii");
        denumireContract.append(" de anul acesta");
        System.out.println(denumireContract);
        denumireContract.append(" " + 1);
        System.out.println(denumireContract);

        System.out.println(denumireContract.indexOf("c"));
        System.out.println(denumireContract.substring(0, 3));
        System.out.println(denumireContract.insert(1, "cuvant nou"));

        System.out.println(denumireContract);

        System.out.println(denumireContract.deleteCharAt(3));
        System.out.println(denumireContract);

        System.out.println(denumireContract.reverse());

        Double sumaContract = 100.22;
        int sumaContractIntreg = 100;
        String sumaContractString = String.valueOf(sumaContractIntreg);
        System.out.println(sumaContractString);

        System.out.println(sumaContract);

        LocalDate dataCurenta = LocalDate.now();
        System.out.println(dataCurenta);

        LocalDateTime timpulCurent=LocalDateTime.now();
        System.out.println(timpulCurent);

        System.out.println(LocalDate.now().minusDays(2));

        LocalDateTime momentulDeIeri=LocalDateTime.now();

        System.out.println(momentulDeIeri.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));




    }
}
