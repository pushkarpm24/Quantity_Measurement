package com.bridgelabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() throws QuantityMeasureException {
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_shouldReturnNotEqual() throws QuantityMeasureException{
        Quantity feet1 = new Quantity(Unit.FEET,0.0);
        Quantity feet2 = null;
        Assert.assertNotEquals(feet1,  feet2);
    }

    @Test
    public void givenSameFeetRefrence_shouldReturnEqual() throws QuantityMeasureException{
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() throws QuantityMeasureException{
        Quantity feet1 = new Quantity(Unit.FEET,1.0);
        Quantity feet2 = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(feet1, feet2);

    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() throws QuantityMeasureException{
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_shouldReturnNotEqual() throws QuantityMeasureException{
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenSameInchRefrence_shouldReturnEquals() throws QuantityMeasureException{
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch, inch);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEquals() throws QuantityMeasureException{
        Quantity inch1 = new Quantity(Unit.INCH,0.0);
        Quantity inch2 = new Quantity(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenValuesWithDifferentType_shouldReturnNotEqual() throws QuantityMeasureException{
        Quantity inch = new Quantity(Unit.INCH,0.0);
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given0FeetAnd0Inch_shouldReturnEqualLength() throws QuantityMeasureException{
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Quantity feet = new Quantity(Unit.FEET, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqualLength() throws QuantityMeasureException{
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnEqualLength() throws QuantityMeasureException{
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqualLength() throws QuantityMeasureException{
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqualLength() throws QuantityMeasureException{
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0YardAnd0Yard_shouldReturnEqualLength() throws QuantityMeasureException{
        Quantity yard1 = new Quantity(Unit.YARD, 0.0);
        Quantity yard2 = new Quantity(Unit.YARD, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqualLength() throws QuantityMeasureException{
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqualLength() throws QuantityMeasureException{
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqualLength() throws QuantityMeasureException{
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqualLength() throws QuantityMeasureException{
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqualLength() throws QuantityMeasureException{
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_shouldReturnEqualLength() throws QuantityMeasureException{
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_shouldReturnEqualLength() throws QuantityMeasureException{
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        Quantity centimeter = new Quantity(Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(centimeter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_whenAdded_shouldReturnResult() throws QuantityMeasureException{
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity inch2 = new Quantity(Unit.INCH, 2.0);
        double resultCheck = inch1.addition(inch2);
        Assert.assertEquals(4.0,resultCheck,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_whenAdded_shouldReturnResult() throws QuantityMeasureException{
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        double resultCheck = feet.addition(inch);
        Assert.assertEquals(14.0,resultCheck,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturnResult() throws QuantityMeasureException{
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        double resultCheck = feet1.addition(feet2);
        Assert.assertEquals(24.0,resultCheck,0.0);
    }

    @Test
    public void given2InchAnd2Point5Centimeter_whenAdded_shouldReturnResult() throws QuantityMeasureException{
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        Quantity centimeter = new Quantity(Unit.CENTIMETER, 2.5);
        double resultCheck = inch.addition(centimeter);
        Assert.assertEquals(3,resultCheck,0.0);
    }

    @Test
    public void given1GalonAnd3Point78Liters_shouldReturnEqualVolume() throws QuantityMeasureException{
        Quantity gallon = new Quantity(Unit.GALLON, 1.0);
        Quantity liter = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LiterAnd1000Ml_shouldReturnEqualVolume() throws QuantityMeasureException{
        Quantity liter = new Quantity(Unit.LITRE, 1.0);
        Quantity ml = new Quantity(Unit.ML, 1000);
        boolean compareCheck = liter.compare(ml);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3Point78Liters_whenAdded_shouldReturnVolumeResult() throws QuantityMeasureException{
        Quantity gallon = new Quantity(Unit.GALLON, 1.0);
        Quantity liter = new Quantity(Unit.LITRE, 3.78);
        double resultCheck = gallon.addition(liter);
        Assert.assertEquals(7.56,resultCheck,0.0);
    }

    @Test
    public void given1LiterAnd1000Ml_whenAdded_shouldReturnVolumeResult() throws QuantityMeasureException{
        Quantity liter = new Quantity(Unit.LITRE, 1.0);
        Quantity ml = new Quantity(Unit.ML, 1000);
        double resultCheck = liter.addition(ml);
        Assert.assertEquals(2.0,resultCheck,0.0);
    }

    @Test
    public void given1KgAnd1000Grams_shouldReturnEqualWeight() throws QuantityMeasureException{
        Quantity kg = new Quantity(Unit.KG, 1.0);
        Quantity gram = new Quantity(Unit.GRAM, 1000);
        boolean compareCheck = kg.compare(gram);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kgs_shouldReturnEqualWeight() throws QuantityMeasureException{
        Quantity tonne = new Quantity(Unit.TONNE, 1.0);
        Quantity kg = new Quantity(Unit.KG, 1000);
        boolean compareCheck = tonne.compare(kg);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Grams_whenAdded_shouldReturnWaightResult() throws QuantityMeasureException{
        Quantity tonne = new Quantity(Unit.TONNE, 1.0);
        Quantity gram = new Quantity(Unit.GRAM, 1000);
        double resultCheck = tonne.addition(gram);
        Assert.assertEquals(1001,resultCheck,0.0);
    }

    @Test
    public void given32FahrenhiteAnd0Degree_shouldReturnEqualTemperature() throws QuantityMeasureException{
        Quantity fahrenhite = new Quantity(Unit.FAHRENHEIT, 32.0);
        Quantity degree = new Quantity(Unit.DEGREE, 0.0);
        boolean compareCheck = fahrenhite.temperature(degree);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given212FahrenhiteAnd100Degree_ahouldReturnEqualTemperature() throws QuantityMeasureException{
        Quantity fahrenhite = new Quantity(Unit.FAHRENHEIT, 212);
        Quantity degree = new Quantity(Unit.DEGREE, 100);
        boolean compareCheck = fahrenhite.temperature(degree);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenNegative40AndNegative40_shouldReturnEqualTemprature() throws QuantityMeasureException{
        Quantity fahrenhite = new Quantity(Unit.FAHRENHEIT, -40.0);
        Quantity degree = new Quantity(Unit.DEGREE, -40.0);
        boolean compareCheck = fahrenhite.temperature(degree);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenDifferentQuantityTypes_whenAdded_shouldThrowException() throws QuantityMeasureException {
        try {
            Quantity kg1 = new Quantity(Unit.KG, 1.0);
            Quantity inch1 = new Quantity(Unit.INCH, 1.0);
            double result = kg1.addition(inch1);
        }catch (QuantityMeasureException e){
            Assert.assertEquals(QuantityMeasureException.ExceptionType.DIFFERENT_QUANTITY, e.type);
        }
    }

    @Test
    public void givenNegative40AndNegative40_whenAdded_shouldThrowTheException() throws QuantityMeasureException {
        try {
            Quantity fahrenhite = new Quantity(Unit.FAHRENHEIT, 212);
            Quantity degree = new Quantity(Unit.DEGREE, 100);
            double compareCheck = fahrenhite.addition(degree);
        } catch (QuantityMeasureException e) {
            Assert.assertEquals(QuantityMeasureException.ExceptionType.TEMPERATURE_EXCEPTION, e.type);
        }
    }
}
