package pl.sebastian.pizzaapplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddPizzasDto {
    private List<AddPizzaDto> pizzas;

    public AddPizzasDto() {
    }

    public AddPizzasDto(List<AddPizzaDto> pizzas) {
        this.pizzas = pizzas;
    }

    public List<AddPizzaDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<AddPizzaDto> pizzas) {
        this.pizzas = pizzas;
    }
}
