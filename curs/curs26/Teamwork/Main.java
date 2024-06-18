package curs.curs26.Teamwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConditionalPrinter printer = (mesaj, color) -> {
            if (color == true) System.out.println(mesaj);

        };

        Student student1 = new Student("Popescu", 20);
        Student student2 = new Student("Ionescu", 40);
        Student student3 = new Student("Marinescu", 60);
        Student student4 = new Student("Plopescu", 80);
        Student student5 = new Student("Tomescu", 90);

        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(student1);
        listaStudenti.add(student2);
        listaStudenti.add(student3);
        listaStudenti.add(student4);
        listaStudenti.add(student5);

        List<Student> listaStudentiSilitori = new ArrayList<Student>();

        for (Student student : listaStudenti) {
            if (student.grade >= 60) {
                listaStudentiSilitori.add(student);
                System.out.println(student.name + " " + student.grade);
            }
        }

        /*Numar min si max*/
        Random numbers = new Random();
        List<Integer> randomNos = new ArrayList<>();

        int n;
        for (int i = 0; i<5;i++){
            n = numbers.nextInt(100);
            randomNos.add(n);
        }

        int min = randomNos.get(0);
        int max = randomNos.get(0);

        for (int number : randomNos){
            System.out.println(number + " ");
            if (number < min)
                min = number;
            if (number > max)
                max = number;
        }

        System.out.println("\n" + max + " " + min);

    }
}
