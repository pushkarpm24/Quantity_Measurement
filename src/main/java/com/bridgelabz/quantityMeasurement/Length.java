package com.bridgelabz.quantityMeasurement;

import java.util.Objects;

public class Length {


    public final Unit unit;
    public double value;



    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length that) {
        boolean check = unit.conversion(this, that);
        return check;
    }

    public double addition(Length that) {
        double result = unit.performAddition(this, that);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }


}
