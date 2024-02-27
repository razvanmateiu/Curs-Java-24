package curs.curs10;

public class Bloc {
    String scara;
    int etaje;
    int apartamente;
    boolean garaj;

    Bloc(String paramScara, int paramEtaje, int paramApartamente, boolean paramGaraj) {
        this.scara = paramScara;
        this.etaje = paramEtaje;
        this.apartamente = paramApartamente;
        this.garaj = paramGaraj;
    }

    public int getEtaje() {

        return this.etaje;
    }
}
