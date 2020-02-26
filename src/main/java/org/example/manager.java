package org.example;

public class manager extends allEmploye {

    private final int base=1500;
    private int nombreEmployes;
    public manager(int nombreEmployes){
        this.nombreEmployes=nombreEmployes;
    }

    @Override
    public double salaire() {
        return base+(nombreEmployes*100);
    }
}
