package br.edu.ifpb.padroes.service.payment.strategies;

import br.edu.ifpb.padroes.service.payment.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void doPayment() {
        System.out.println("Do credit card payment!");
    }
}
