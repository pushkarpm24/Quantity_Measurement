package com.bridgelabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_shouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1,  feet2);
    }

    @Test
    public void givenSameFeetRefrence_shouldReturnEqual() {
        Length feet = new Length(Unit.FEET,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assert.assertNotEquals(feet1, feet2);

    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_shouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenSameInchRefrence_shouldReturnEquals() {
        Length inch = new Length(Unit.INCH,0.0);
        Assert.assertEquals(inch, inch);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEquals() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenValuesWithDifferentType_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH,0.0);
        Length feet = new Length(Unit.FEET,0.0);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given0FeetAnd0Inch_shouldReturnEqualLength() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length feet = new Length(Unit.FEET, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqualLength() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqualLength() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqualLength() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0YardAnd0Yard_shouldReturnEqualLength() {
        Length yard1 = new Length(Unit.YARD, 0.0);
        Length yard2 = new Length(Unit.YARD, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqualLength() {
        Length feet = new Length(Unit.FEET, 3.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqualLength() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }
}
