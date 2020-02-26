package org.example;


public class vendeur extends allEmploye{
    final private int base=2000;
    private int comission;
    public vendeur(int comission){
        this.comission=comission;
    }
    @Override
    public double salaire(){
        return base+comission;
    }
}
