package com.hridoykrisna.paymentmodel;

public class PaymentMethodFactory {
    public static PaymentMethod getPaymentMethod(String type){

       switch (type){
           case "bkash":
               return new BkashPaymentMethod();
           case "nagad":
               return new NagadPaymentMethod();
           case "card":
               return new CardPaymentMethod();

           default: return new CashPaymentMethod();
       }
    }
}
