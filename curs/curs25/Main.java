package curs.curs25;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        /*Clasa anonima - clasa care extinde clasa Car*/
        Car carAnonim = new Car() {
            @Override
            public void metodaDinClasaAnonima() {
                System.out.println("Am aplecat metoda din clasa anonima");
            }

            @Override
            public void functioneaza() {
                System.out.println("Functioneaza bine in clasa anonima");
            }
        };
        carAnonim.functioneaza();
        carAnonim.metodaDinClasaAnonima();

        CumparaturiInterface cumparaturiInterface1 = new CumparaturiInterface() {
            @Override
            public void cumpara() {
                System.out.println("S-a apelat metoda cumpara()");
            }
        };
        /*Lambda expression ()->{}*/
        CumparaturiInterface cumparaturiInterface2 = () -> System.out.println("S-a apelat metoda cumpara prin Lambda");
        cumparaturiInterface1.cumpara();
        cumparaturiInterface2.cumpara();
    }
}
