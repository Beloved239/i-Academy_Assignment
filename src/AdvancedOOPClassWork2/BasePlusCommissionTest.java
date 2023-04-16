package AdvancedOOPClassWork2;

import AdvancedOOPClassWork.BasePlusCommissionRate;

public class BasePlusCommissionTest {
    public static void main(String[] args) {
//        BasePlusCommissionRate Segun = new BasePlusCommissionRate("Segun","Olowe",);
        BasePlusCommission Segun =new BasePlusCommission("Segun","Olowe","123456789",12000,0.35,120);

        System.out.println(Segun.toString());
    }
}
