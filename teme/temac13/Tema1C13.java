package teme.temac13;

public class Tema1C13 {
    public static void main(String[] args) {
//        -Create a Java program that uses a StringBuilder to concatenate an array of strings.
//        The program should print the final concatenated string. (methods: append())
//        -Create a class named Student with name and age fields. Write a method to display the details of a student.
//        -Write a program that prints the current date.
//        -Print the date that will be after 10 days from today.
        String[] sirCuvinte = {"Aceasta", "este", "o", "propozitie", "facuta", "dintr-un", "String array"};
        StringBuilder propozitie= new StringBuilder();
        for (int i=0; i<sirCuvinte.length; ++i)
        {
            propozitie.append(sirCuvinte[i]+" ");
        }
        System.out.println(propozitie);



    }
}
