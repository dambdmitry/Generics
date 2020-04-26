package com.company;

public class WithCommissionPayment extends Payment {
    private double amount;

    public WithCommissionPayment(double amount) throws Exception {
        super(amount);
        if(amount > 0) {
            this.amount = amount;
        }else{
            throw new Exception("Сумма платежа должна быть неотрицательной");
        }
    }

    //Возвращает сумму комиссии.
    public double getCommissionAmount(){
        double procent = 1; //Процент комиссии.
        return this.amount * (procent / 100);
    }

    //Возвращает сумму перевода с учетом комиссии.
    public double getAmount(){
        return  this.amount + getCommissionAmount();
    }


}
