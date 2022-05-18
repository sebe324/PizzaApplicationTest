package pl.sebastian.pizzaapplicationtest.remote.rest.dto.response;

import java.util.List;

public class PizzasDto {
    private List<PizzaDto> pizzas;

    public PizzasDto() {
    }

    public PizzasDto(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }

    public List<PizzaDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }
}
