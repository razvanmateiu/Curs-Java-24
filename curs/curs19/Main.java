package curs.curs19;

public class Main {
    public static void main(String[] args) {
//        ClasaPrincipala clasaSecundara = new ClasaSecundara();
        Circle circle1 = new Circle(10.00);
        System.out.println("Aria cercului cu raza de " + circle1.getRadius() + " este: " + circle1.getArea());
        System.out.println(circle1.gerCircumference());
        Calculator calc1 = new Calculator();

        System.out.println(calc1.addSumOfTwo(1, 2));
        System.out.println(calc1.addSumOfThree(1, 2, 3));
        System.out.println(calc1.addSumOfTwoDouble(2.45, 1.23));

    }
}
