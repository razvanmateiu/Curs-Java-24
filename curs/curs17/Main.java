package curs.curs17;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mamifer mamifer1 = new Mamifer();
        mamifer1.mananca();
        mamifer1.faceZgomot();
        /*Teamwork*/

        List<Contact> contacte = new ArrayList<>();


        Contact contact1 = new Contact("Popescu", "1234");
        Contact contact2 = new Contact("Robert", "12345");
        Contact contact3 = new Contact("Razvan", "123456");

        contacte.add(contact1);
        contacte.add(contact2);
        contacte.add(contact3);

        /*Meniu*/
        System.out.print("Alegeti o optiune: \n1 Adauga Contact \n2 Sterge Contact \n3 Cauta Contact \n4 Iesire");
        System.out.println();

        /*add */
        System.out.println("Adauga Contact");
        System.out.print("Nume: ");
        Scanner scanner = new Scanner(System.in);
        String nameAdd = scanner.next();

        System.out.print("Nr telefon: ");
        String phoneNumberAdd = scanner.next();

        Contact contact4 = new Contact();
        contact4.addContact(nameAdd, phoneNumberAdd);
        contacte.add(contact4);

        System.out.println(contact4.getName());
        System.out.println(contact4.getPhoneNumber());

        /*remove*/
        int index=1;
        for (Contact contact:contacte){
            System.out.println(index+" "+contact.getName()+" "+contact.getPhoneNumber());
            index++;
        }
        System.out.print("Alegeti contactul ce trebuie sters: ");
        int indexRemove=scanner.nextInt();
        contacte.remove(indexRemove-1);

        index=1;
        for (Contact contact:contacte){
            System.out.println(index+" "+contact.getName()+" "+contact.getPhoneNumber());
            index++;
        }
        /*search*/


    }
}
