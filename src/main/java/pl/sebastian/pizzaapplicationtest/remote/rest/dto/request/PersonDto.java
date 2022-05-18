package pl.sebastian.pizzaapplicationtest.remote.rest.dto.request;

public class PersonDto {
    private String name;
    private int phone;
    private String address;
    private int floor;

    public PersonDto() {
    }

    public PersonDto(String name, int phone, String address, int floor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
