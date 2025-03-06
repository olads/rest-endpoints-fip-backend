package com.migia.week3.dto;
import jakarta.validation.constraints.NotNull;


public class StringRequest {
    @NotNull(message = "Parameter 'input' is required")
    private String input;

    // Getters and Setters

    public String getInput() {
        return this.input;
    }

    public void setInput(String input) {
        this.input = input;
    }

}