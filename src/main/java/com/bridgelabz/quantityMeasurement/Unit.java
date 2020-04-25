package com.bridgelabz.quantityMeasurement;

public enum Unit {
    FEET(12.0, "length"),
    INCH(1, "length"),
    YARD(36.0, "length"),
    CENTIMETER(1.0/2.5, "length"),
    GALLON(3.78, "volume"),
    LITRE(1, "volume"),
    ML(1.0/1000, "volume"),
    KG(1, "weight"),
    GRAM(1.0/1000, "weight"),
    TONNE(1000, "weight"),
    DEGREE(1.0, "temperature"),
    FAHRENHEIT(1.0, "temperature");

    double baseUnitConversion;
    String quantityType;

    Unit(double baseUnitConversion, String quantityType) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityType = quantityType;
    }

    public boolean conversion(Quantity q1, Quantity q2) throws QuantityMeasureException {
        if(!q1.unit.quantityType.equals(q2.unit.quantityType)) {
            throw new QuantityMeasureException(QuantityMeasureException.ExceptionType.DIFFERENT_QUANTITY, "Different quqntities should not be given..");
        }

         return Double.compare(q1.value*q1.unit.baseUnitConversion,
                                q2.value*q2.unit.baseUnitConversion) == 0;
    }

    public double performAddition(Quantity q1, Quantity q2) throws QuantityMeasureException {
        if(!q1.unit.quantityType.equals(q2.unit.quantityType)) {
            throw new QuantityMeasureException(QuantityMeasureException.ExceptionType.DIFFERENT_QUANTITY, "Different quqntities should not be given..");
        }
        if(q1.unit.quantityType == "temperature" && q2.unit.quantityType == "temperature") {
            throw new QuantityMeasureException(QuantityMeasureException.ExceptionType.TEMPERATURE_EXCEPTION, "Temperature cannot be added...");
        }
        double firstValue = q1.value*q1.unit.baseUnitConversion;
        double secondValue = q2.value*q2.unit.baseUnitConversion;
        return firstValue + secondValue;
    }

    public boolean compareTemperature(Quantity q1, Quantity q2) throws QuantityMeasureException{
        if(!q1.unit.quantityType.equals(q2.unit.quantityType)) {
            throw new QuantityMeasureException(QuantityMeasureException.ExceptionType.DIFFERENT_QUANTITY, "Different quqntities should not be given..");
        }

        double temperature;
        if(q1.unit.equals(Unit.DEGREE)) {
            temperature = (q1.value * 9/5) + 32;
        }
        else {
            temperature = (q1.value-32) * 5/9;
        }
        return Double.compare(temperature,q2.value) == 0;
    }
}
