package pl.sebastian.pizzaapplicationtest.data.entity.PizzaEntity;

import pl.sebastian.pizzaapplicationtest.data.entity.SizeEntity.SizeEntity;
import pl.sebastian.pizzaapplicationtest.remote.rest.dto.response.SizeDto;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="pizzas")
public class PizzaEntity {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy = "pizza")
    private Set<SizeEntity> sizes;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PizzaEntity() {
    }

    public Set<SizeEntity> getSizes() {
        return sizes;
    }

    public void setSizes(Set<SizeEntity> sizes) {
        this.sizes = sizes;
    }

    public int getId() {
        return id;
    }
}
