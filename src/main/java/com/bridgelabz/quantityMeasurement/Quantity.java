package com.bridgelabz.quantityMeasurement;

public class Quantity {


    public final Unit unit;
    public double value;



    public Quantity(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Quantity that) throws QuantityMeasureException {
        boolean check = unit.conversion(this, that);
        return check;
    }

    public double addition(Quantity that) throws QuantityMeasureException {
        double result = unit.performAddition(this, that);
        return result;
    }

    public boolean temperature(Quantity that) throws QuantityMeasureException {
        boolean check = unit.compareTemperature(this, that);
        return check;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 &&
                unit == quantity.unit;
    }


}
