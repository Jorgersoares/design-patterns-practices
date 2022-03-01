package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountDecorator extends PizzaBaseDecorator{
    public DiscountDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice() {
        Float price = pizza.getPrice();
        price = price - (price * 0.25f);
        return price;
    }

}
