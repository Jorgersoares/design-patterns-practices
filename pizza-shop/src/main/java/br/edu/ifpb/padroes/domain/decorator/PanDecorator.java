package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanDecorator extends DiscountDecorator{
    public PanDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice() {
        return pizza.getPrice() * 1.10f;
    }
}
