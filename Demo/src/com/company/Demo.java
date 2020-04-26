package com.company;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws Exception {
        List<Payment> payments = new ArrayList<>(); //Список платежей как с комиссией, так и без.
        PaymentCalculator<Payment> calculator = new PaymentCalculator<>(); //Калькулятор платежей списка payments.

        //Исключение на то, что введена корректная сумма.
        try {
            payments.add(new Payment(100));
            payments.add(new WithCommissionPayment(100));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(calculator.getSum(payments));
        System.out.println(calculator.getMax(payments));



        List<WithCommissionPayment> withCommissionPayments = new ArrayList<>(); //Список платежей с комиссией.
        PaymentCalculator<WithCommissionPayment> paymentCalculator = new PaymentCalculator<>(); // Калькулятор платежей с комиссией.

        //Исключение на то, что введена корректная сумма.
        try {
            withCommissionPayments.add(new WithCommissionPayment(100));
            withCommissionPayments.add(new WithCommissionPayment(200));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(paymentCalculator.getSum(withCommissionPayments));
        System.out.println(paymentCalculator.getMax(withCommissionPayments).getAmount());
    }
}
