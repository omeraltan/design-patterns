package com.principle.dependencyinversion;

interface Payment{
    void processPayment(double amount);
}

class CreditCardPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment credit card completed! Result : " + amount);
    }
}

class PaypalPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment paypal card completed! Result : " + amount);
    }
}

public class OrderProcessor {

    private Payment payment;

    public OrderProcessor(Payment payment) {
        this.payment = payment;
    }

    public void processOrder(double amount) {
        payment.processPayment(amount);
    }
}

class TestOrderProcessor {

    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        OrderProcessor orderProcessor1 = new OrderProcessor(creditCardPayment);
        orderProcessor1.processOrder(100.0);

        Payment paypalPayment = new PaypalPayment();
        OrderProcessor orderProcessor2 = new OrderProcessor(paypalPayment);
        orderProcessor2.processOrder(200.0);
    }

}
