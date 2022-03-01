package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public interface PaymentProcessorHandler {

    public abstract PaymentProcessorHandler setNext(PaymentProcessorHandler paymentProcessorHandler);
    public abstract void process(Property property);

}
