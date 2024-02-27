package curs.curs9;

public class Main {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println(index);
        }
        int numarCursuri = 900;
        switch (numarCursuri) {
            case 3:
                System.out.println("Este pe cazul 3");
                break;
            case 9:
                System.out.println("Este pe cazul 9");
                break;
            case 10:
                System.out.println("Nu ai dpretate!");
                break;
            default:
                System.out.println("Nici un caz nu este adevarat");
        }
        int numarZileDeVacanta = 10;
        while (numarZileDeVacanta < 20) {
            System.out.println(numarZileDeVacanta);
            numarZileDeVacanta++;
        }
        int doVariabila = 100;
        do {
            System.out.println(doVariabila);
            doVariabila++;
        } while (doVariabila < 110);
    }
}