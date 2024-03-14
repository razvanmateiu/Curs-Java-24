package teme.temac14;

import java.util.ArrayList;

public class Challenge5S06 {
    public static void main(String[] args) {
//        5. Word Capitalizer
//        Description: Write a program that capitalizes the first letter of every word in a
//        sentence using the StringBuilder class.
        StringBuilder propozitie = new StringBuilder("ana are mere si pere");
        System.out.println(Capitalize(propozitie));
    }

    public static StringBuilder Capitalize(StringBuilder propozitie) {
        String[] cuvinte = propozitie.toString().split(" ");
        StringBuilder propozitieNoua = new StringBuilder();
        char ch;
        char[] chars;
        for (String cuvant : cuvinte) {
            ch = Character.toUpperCase(cuvant.charAt(0));
            chars = cuvant.toCharArray();
            chars[0] = ch;
            cuvant = String.copyValueOf(chars);
            propozitieNoua.append(cuvant+" ");
        }
        return propozitieNoua;

    }
}
