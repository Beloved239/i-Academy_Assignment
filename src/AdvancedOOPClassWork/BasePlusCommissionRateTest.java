package AdvancedOOPClassWork;

import AdvancedOOP.BasePlusCommissionEmployee;

public class BasePlusCommissionRateTest {
    public static void main(String[] args) {
        CommissionEmployee Tobi = new CommissionEmployee("Tobi","Ade","123456789",1200,0.2);

//        Tobi.commissionEmployeeDisplayInfo();


        BasePlusCommissionRate Oyin = new BasePlusCommissionRate("Oyin","Ola","123456789",1200,35,120000.0);

        Oyin.commissionEmployeeDisplayInfo();

    }
}
