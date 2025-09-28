package anotation.custom;

import anotation.custom.annotation.YearRange;

public class CarRequest {
    private String model;
    @YearRange(min = 2000, max = 2025)
    private int year;

    public CarRequest(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }
}
