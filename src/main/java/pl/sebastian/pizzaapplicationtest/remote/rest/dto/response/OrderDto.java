package pl.sebastian.pizzaapplicationtest.remote.rest.dto.response;

import pl.sebastian.pizzaapplicationtest.domain.enums.OrderStatusType;
import pl.sebastian.pizzaapplicationtest.remote.rest.dto.request.AddPizzasDto;
import pl.sebastian.pizzaapplicationtest.remote.rest.dto.request.PersonDto;

public class OrderDto {
    private int id;
    private OrderStatusType status;
    private AddPizzasDto pizzas;
    private PersonDto person;

    public OrderDto() {
    }

    public OrderDto(int id, OrderStatusType status, AddPizzasDto pizzas, PersonDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public AddPizzasDto getPizzas() {
        return pizzas;
    }

    public void setPizzas(AddPizzasDto pizzas) {
        this.pizzas = pizzas;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
