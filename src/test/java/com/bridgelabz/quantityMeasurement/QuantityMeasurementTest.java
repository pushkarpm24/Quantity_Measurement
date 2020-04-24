package com.bridgelabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_shouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = null;
        Assert.assertNotEquals(feet1,  feet2);
    }

    @Test
    public void givenSameFeetRefrence_shouldReturnEqual() {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        Quantity feet2 = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(feet1, feet2);

    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenSameInchRefrence_shouldReturnEquals() {
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch, inch);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEquals() {
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenValuesWithDifferentType_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given0FeetAnd0Inch_shouldReturnEqualLength() {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Quantity feet = new Quantity(Unit.FEET, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqualLength() {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqualLength() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqualLength() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0YardAnd0Yard_shouldReturnEqualLength() {
        Quantity yard1 = new Quantity(Unit.YARD, 0.0);
        Quantity yard2 = new Quantity(Unit.YARD, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqualLength() {
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqualLength() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqualLength() {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqualLength() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqualLength() {
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_shouldReturnEqualLength() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_shouldReturnEqualLength() {
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        Quantity centimeter = new Quantity(Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(centimeter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_whenAdded_shouldReturnResult() {
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity inch2 = new Quantity(Unit.INCH, 2.0);
        double resultCheck = inch1.addition(inch2);
        Assert.assertEquals(4.0,resultCheck,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_whenAdded_shouldReturnResult() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        double resultCheck = feet.addition(inch);
        Assert.assertEquals(14.0,resultCheck,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturnResult() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        double resultCheck = feet1.addition(feet2);
        Assert.assertEquals(24.0,resultCheck,0.0);
    }

    @Test
    public void given2InchAnd2Point5Centimeter_whenAdded_shouldReturnResult() {
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        Quantity centimeter = new Quantity(Unit.CENTIMETER, 2.5);
        double resultCheck = inch.addition(centimeter);
        Assert.assertEquals(3,resultCheck,0.0);
    }
}
