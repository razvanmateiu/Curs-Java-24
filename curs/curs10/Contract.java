package curs.curs10;

public class Contract {
    String status;
    int valoare;
    boolean verificat;
    boolean aprobat;

    Contract(String paramStatus, int paramValoare, boolean paramVerificat, boolean paramAprobat) {
        this.status = paramStatus;
        this.valoare = paramValoare;
        this.verificat = paramVerificat;
        this.aprobat = paramAprobat;
    }
}
