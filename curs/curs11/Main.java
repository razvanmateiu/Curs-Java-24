package curs.curs11;

public class Main {
    public static void main(String[] args) {
//        /**Am creat un obiect de Floare=am creat o instanta de tip Floare*/
//        Floare lalea = new Floare(3);
//
//        Floare lalea1 = new Floare(5, "verde");
//
//        int numarul10 = lalea.metodaCareIntoarceUnNrIntreg();
//        System.out.println(numarul10);
//
//        String variabilaAnimal="Leu     ";
//        System.out.println(variabilaAnimal.trim().toUpperCase());

        Om om1 = new Om("Gigi", 16, 2353, true);
        Om om2 = new Om();

        Contract contract1 = new Contract();
        Contract contract2 = new Contract("aprobat", 12, false, true);

        Student student1 = new Student();
        Student student2 = new Student("Verde", "Constructii", true, 12);
    }
}
