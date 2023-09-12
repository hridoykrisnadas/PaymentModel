package com.hridoykrisna.paymentmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PaymentMethod paymentMethod = PaymentMethodFactory.getPaymentMethod("bkash");
        paymentMethod.process(250);
        paymentMethod.process(450);
        paymentMethod.process(780);

        PaymentMethod paymentMethod2 = PaymentMethodFactory.getPaymentMethod("nagad");
        paymentMethod2.process(350);
        paymentMethod2.process(871);


        PaymentMethod paymentMethod3 = PaymentMethodFactory.getPaymentMethod("nagad");
        paymentMethod3.process(350);
        paymentMethod3.process(151);
        paymentMethod3.process(980);
        paymentMethod3.process(785);
    }
}