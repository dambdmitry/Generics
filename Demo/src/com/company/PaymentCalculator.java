package com.company;

import java.util.List;

public class PaymentCalculator <T extends Payment> {

    //Возвращает сумму платежей списка типа T.
    public double getSum(List<T> payments){
        double sum = 0;
        for(T payment: payments){
            sum += payment.getAmount();
        }
        return sum;
    }

    //Возвращает объект типа T, который имеет максимальное значение метода getAmount().
    public T getMax(List<T> payments){
        double max = -1;
        T maxPayment = null;
        for(T payment: payments){
            if(max < payment.getAmount()){
                max = payment.getAmount();
                maxPayment = payment;
            }
        }
        return maxPayment;
    }
}
