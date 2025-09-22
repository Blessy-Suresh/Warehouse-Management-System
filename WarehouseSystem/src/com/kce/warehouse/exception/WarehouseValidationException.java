package com.kce.warehouse.exception;

public class WarehouseValidationException extends Exception {
    @Override
    public String toString() {
        return "Invalid input data!";
    }
}
