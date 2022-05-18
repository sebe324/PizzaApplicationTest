package pl.sebastian.pizzaapplicationtest.remote.rest.dto.response;

import pl.sebastian.pizzaapplicationtest.domain.enums.SizeType;

public class SizeDto {
    private int id;
    private SizeType size;
    private float price;

    public SizeDto() {
    }

    public SizeDto(int id, String name, SizeType size, float price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
