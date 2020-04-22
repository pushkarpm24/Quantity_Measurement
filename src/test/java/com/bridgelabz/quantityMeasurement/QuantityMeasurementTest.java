package com.bridgelabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1,  feet2);
    }

    @Test
    public void givenSameFeetRefrence_shouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertNotEquals(feet1, feet2);

    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenSameInchRefrence_shouldReturnEquals() {
        Length inch = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch, inch);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEquals() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenValuesWithDifferentType_shouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH,0.0);
        Length feet = new Length(Length.Unit.FEET,0.0);
        Assert.assertNotEquals(inch, feet);
    }
}
