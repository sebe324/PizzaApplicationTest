package pl.sebastian.pizzaapplicationtest.remote.rest.dto.response;

public class PizzaDto {
    private int id;
    private String name;
    private SizesDto sizes;

    public PizzaDto() {
    }

    public PizzaDto(int id, String name, SizesDto sizes) {
        this.id = id;
        this.name = name;
        this.sizes = sizes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SizesDto getSizes() {
        return sizes;
    }

    public void setSizes(SizesDto sizes) {
        this.sizes = sizes;
    }
}
