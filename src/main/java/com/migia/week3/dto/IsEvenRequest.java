package com.migia.week3.dto;
import jakarta.validation.constraints.NotNull;


public class IsEvenRequest {
    @NotNull(message = "Parameter 'number' is required")
    private Integer number;

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


}
