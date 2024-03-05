package curs.curs11;

public class Student {

    String legitimatie;
    String profilFacultate;
    boolean uniforma;
    int varsta;

    Student(String legitimatirParam, String profilFacultateParam, boolean uniformaParam, int varstaParam) {
        this.legitimatie = legitimatirParam;
        this.profilFacultate = profilFacultateParam;
        this.uniforma = uniformaParam;
        this.varsta = varstaParam;
    }

    Student() {
        this.legitimatie = "valabila";
    }

    int getVarsta() {
        return varsta;
    }

    void setUniforma(boolean uniformaParam) {
        uniforma = uniformaParam;
    }
}
