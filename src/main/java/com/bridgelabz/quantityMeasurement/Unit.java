package com.bridgelabz.quantityMeasurement;

public enum Unit {
    FEET(12.0),
    INCH(1),
    YARD(36.0),
    CENTIMETER(1.0/2.5),
    GALLON(3.78),
    LITRE(1),
    ML(1.0/1000),
    KG(1),
    GRAM(1.0/1000),
    TONNE(1000),
    DEGREE(9/5),
    FAHRENHEIT(5/9);

    private final double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public boolean conversion(Quantity q1, Quantity q2) {
         return Double.compare(q1.value*q1.unit.baseUnitConversion,
                                q2.value*q2.unit.baseUnitConversion) == 0;
    }

    public double performAddition(Quantity q1, Quantity q2) {
        double firstValue = q1.value*q1.unit.baseUnitConversion;
        double secondValue = q2.value*q2.unit.baseUnitConversion;
        return firstValue + secondValue;
    }

    public boolean compareTemperature(Quantity q1, Quantity q2) {
        double temperature;
        if(q1.unit.equals(Unit.DEGREE)) {
            temperature = (q1.value*q1.unit.baseUnitConversion) + 32;
        }
        else {
            temperature = (q1.value-32) * q2.unit.baseUnitConversion;
        }
        return Double.compare(temperature,q2.value) == 0;
    }
}
