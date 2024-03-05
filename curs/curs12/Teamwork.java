package curs.curs12;

public class Teamwork {
    public static void main(String[] args) {
        String var = "arahida";
        var = var.replace("a", "i");
        System.out.println(var);

        String va1 = "  Dacia   ";
        System.out.println(va1.trim());

        Fruct capsuna = new Fruct("capsuna", "rosu", "rotunda", 100);
        Legume telina = new Legume("telina", "alba", "lunguiata", "aromat");

        capsuna.afiseazaMetoda();
        System.out.println(capsuna.getNumeFruct());

        telina.afiseazaCuloarea();
        System.out.println(telina.getCuloare());


    }
}
