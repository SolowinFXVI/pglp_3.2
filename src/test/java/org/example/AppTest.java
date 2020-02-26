package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test_1(){
        vendeur v1 = new vendeur(10);
        vendeur v2 = new vendeur(20);
        employe e1 = new employe(2010);
        employe e2 = new employe(2005);
        ArrayList<allEmploye> listEmploye = new ArrayList<allEmploye>();
        listEmploye.add(e1);
        listEmploye.add(e2);
        listEmploye.add(v1);
        listEmploye.add(v2);
        double salaire_total = 0;
        for(int i = 0; i < listEmploye.size(); i++){
         salaire_total += listEmploye.get(i).salaire();
        }
        System.out.println("salaire total : " + salaire_total);
        assertTrue(salaire_total == 7530.0);
    }
}
