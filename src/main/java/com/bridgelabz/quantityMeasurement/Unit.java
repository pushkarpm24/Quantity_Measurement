package com.bridgelabz.quantityMeasurement;

public enum Unit {
    FEET(12.0),
    INCH(1),
    YARD(36.0),
    CENTIMETER(1.0/2.5),
    GALLON(3.785),
    LITRE(1);

    private final double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public boolean conversion(Quantity l1, Quantity l2) {
         return Double.compare(l1.value*l1.unit.baseUnitConversion,
                                l2.value*l2.unit.baseUnitConversion) == 0;
    }

    public double performAddition(Quantity l1, Quantity l2) {
        double firstValue = l1.value*l1.unit.baseUnitConversion;
        double secondValue = l2.value*l2.unit.baseUnitConversion;
        return firstValue + secondValue;
    }
}
