package com.migia.week3.dto;

import jakarta.validation.constraints.NotNull;

public class AddNumbersRequest {
    @NotNull(message = "Parameter 'a' is required")
    private Integer a;

    @NotNull(message = "Parameter 'b' is required")
    private Integer b;


    public Integer getA() {
        return this.a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return this.b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
  
}