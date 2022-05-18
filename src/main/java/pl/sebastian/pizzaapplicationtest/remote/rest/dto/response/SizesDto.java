package pl.sebastian.pizzaapplicationtest.remote.rest.dto.response;

import java.util.List;

public class SizesDto {
    private List<SizeDto> sizes;

    public SizesDto() {
    }

    public SizesDto(List<SizeDto> sizes) {
        this.sizes = sizes;
    }

    public List<SizeDto> getSizes() {
        return sizes;
    }

    public void setSizes(List<SizeDto> sizes) {
        this.sizes = sizes;
    }
}
