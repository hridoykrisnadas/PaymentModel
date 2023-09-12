package com.hridoykrisna.paymentmodel;

public class CardPaymentMethod implements PaymentMethod{
    @Override
    public void process(double amount) {
        String className = this.getClass().getName();
        className = className.replace("com.hridoykrisna.paymentmodel.", "");
        System.out.println(className+": Payable Amount: "+amount);
    }
}
