package com.bridgelabz.quantityMeasurement;

import java.util.Objects;

public class Length {
    enum Unit { FEET, INCH};

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
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
