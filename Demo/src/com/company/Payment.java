package com.company;

public class Payment {
    private double amount;

    public Payment(double amount) throws Exception {
        if(amount > 0) {
            this.amount = amount;
        }else{
            throw new Exception("Сумма платежа должна быть неотрицательной");
        }
    }

    public double getAmount(){
        return this.amount;
    }
}
