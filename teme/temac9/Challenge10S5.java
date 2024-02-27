package teme.temac9;

import java.util.Scanner;

public class Challenge10S5 {
//    10. Jump Statements
//    Create a menu-driven program where the user is presented with options:
//
//    Print "Hello World"
//    Print the user's name.
//    Exit.
//    Based on the user's input, perform the necessary action. Once an action is completed,
//    show the menu again, unless the user chooses the Exit option. Use jump statements to control the flow of the program.
public static void main(String[] args) {
    String username="Razvan";
    int numar;
    do{
        System.out.println("Comenzi disponibile:");
        System.out.println("1. Printeaza Hello World");
        System.out.println("2. Printeaza Username");
        System.out.println("3. Exit");
        System.out.print("Alege o comanda:");
        Scanner scanner=new Scanner(System.in);
        numar=scanner.nextInt();
        if (numar<=0 || numar>=4) System.out.println("Comanda indisponibila");
        if (numar==1) System.out.println("Hello World");
        if (numar==2) System.out.println(username);
        if (numar==3) break;
    }
    while (true);

}

}
