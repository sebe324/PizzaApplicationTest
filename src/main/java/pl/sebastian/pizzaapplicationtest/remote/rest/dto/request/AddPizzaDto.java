package pl.sebastian.pizzaapplicationtest.remote.rest.dto.request;

public class AddPizzaDto {
    private int id;
    private int sizeId;
    private int count;

    public AddPizzaDto() {
    }

    public AddPizzaDto(int id, int sizeId, int count) {
        this.id = id;
        this.sizeId = sizeId;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
