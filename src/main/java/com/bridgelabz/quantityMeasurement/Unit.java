package com.bridgelabz.quantityMeasurement;

public enum Unit {
    FEET(12.0), INCH(1), YARD(36.0);

    private final double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public boolean conversion(Length l1, Length l2) {
         return Double.compare(l1.value*l1.unit.baseUnitConversion,
                                l2.value*l2.unit.baseUnitConversion) == 0;
    }
}
