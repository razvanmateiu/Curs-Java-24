package curs.curs11;

public class Om {
    String nume;
    int varsta;
    int CNP;
    boolean isPar;

    Om(String numeParam, int varstaParam, int CNPParam, boolean isParParam) {
        this.nume = numeParam;
        this.varsta = varstaParam;
        this.CNP = CNPParam;
        this.isPar = isParParam;
    }

    Om() {
        isPar = true;
    }

    int getVarsta() {
        return varsta;
    }

    void setNume(String numeParam) {
        nume = numeParam;
    }

}
