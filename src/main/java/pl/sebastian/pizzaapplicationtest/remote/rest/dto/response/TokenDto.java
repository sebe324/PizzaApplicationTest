package pl.sebastian.pizzaapplicationtest.remote.rest.dto.response;

public class TokenDto {
    private String token;

    public TokenDto(String token) {
        this.token = token;
    }

    public TokenDto() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}