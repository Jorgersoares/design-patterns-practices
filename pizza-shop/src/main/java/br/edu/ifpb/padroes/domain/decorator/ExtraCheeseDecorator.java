package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheeseDecorator extends DiscountDecorator{
    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice() {
        return pizza.getPrice() * 1.15f;
    }
}
