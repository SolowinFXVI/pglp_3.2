package org.example;

public class employe extends allEmploye{
    final private int salaire = 1500;
    private int startYear;
    public employe(int startYear) {
        this.startYear=startYear;
    }
    @Override
    public double salaire(){
        return salaire+(2020-this.startYear)*20;
    }
}
