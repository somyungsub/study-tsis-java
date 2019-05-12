package design_pattern.chap04_factory;

import java.util.Optional;
import java.util.stream.Stream;

public class ChicagoPizzaStore extends PizzaStore {

    // 피자 생성 코드
    @Override
    public Pizza createPizza(String type) {

        PizzaIngredientFactory factory = ChicagoPizzaIngredientFactory.getInstance();

        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(factory);
        } else if (type.equals("clam")) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        pizza.setName(type);
        return pizza;

    }

}
