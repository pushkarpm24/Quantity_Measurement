package com.bridgelabz.quantityMeasurement;

public class QuantityMeasureException extends Exception {

    public ExceptionType type;

    public enum ExceptionType {
        DIFFERENT_QUANTITY,TEMPERATURE_EXCEPTION;
    }

    public QuantityMeasureException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
