package pl.sebastian.pizzaapplicationtest.data.entity.SizeEntity;

import pl.sebastian.pizzaapplicationtest.data.entity.PizzaEntity.PizzaEntity;
import pl.sebastian.pizzaapplicationtest.domain.enums.SizeType;

import javax.persistence.*;

@Entity
@Table(name="sizes")
public class SizeEntity {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="size")
    private SizeType size;
    @Column(name="price")
    private float price;
    @ManyToOne
    @JoinColumn(name="pizza",table="pizza", referencedColumnName = "id")
    private PizzaEntity pizza;

    public SizeEntity() {
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public PizzaEntity getPizza() {
        return pizza;
    }

    public void setPizza(PizzaEntity pizza) {
        this.pizza = pizza;
    }
}
