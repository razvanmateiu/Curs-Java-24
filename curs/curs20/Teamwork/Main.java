package curs.curs20.Teamwork;

public class Main {
    public static void main(String[] args) {
        Geometry areaNew=new Geometry();
        System.out.println("Cerc R=10");
        System.out.println(areaNew.area(10));
        System.out.println("Triunghi B=5, I=10");
        System.out.println(areaNew.area(5,10));
        System.out.println(("Dreptunghi B=10, I=5"));
        System.out.println(areaNew.area(10.9,5.1));

    }
}
