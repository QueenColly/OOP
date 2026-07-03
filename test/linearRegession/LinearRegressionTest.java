package linearRegession;

import airConditioner.AirConditioner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearRegressionTest {
    private LinearRegression linear;

    @BeforeEach
    public void setUp() {
        linear = new LinearRegression();
    }

    @Test
        public void theAverageOfnumerator(){
        double[] x = {1,2,3,4,5};
        double actual = (linear.getNumeratorAverage(x));
        assertEquals(3,actual);
    }
    @Test
        public void theAverageOfdenominator(){
        double[] y = {40,60,70,90,100};
        double actual = linear.getDenominatorAverage(y);
        assertEquals(72,actual);


    }
    @Test
        public void theDifferenceFromX_Average(){
            double[] x = {1,2,3,4,5};
            double[] actual = linear.getSubtractedXAverage(x);
            double[] expected = {-2,-1,0,1,2};
            assertArrayEquals(expected, actual);
    }
    @Test
    public void theDifferenceFromY_Average(){
        double[] y = {40,60,70,90,100};
        double[] actual = linear.getSubtractedYAverage(y);
        double[] expected = {-32,-12,-2,18,28};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void theProductOfX_And_Y_difference(){
        double[] differenceOfX =    {-2,-1,0,1,2};
        double[] differenceOfY =  {-32,-12,-2,18,28};
        double[] actual = linear.getMultipliedArray(differenceOfX,differenceOfY);
        double[] expected = {64,12,0,18,56};
        assertArrayEquals(expected, actual, 0.0001);
    }
//    @Test
//    public void theAverageOfBoth_numerator_and_denominator(){
//        double[] numeratorAverage = {1,2,3,4,5};
//        double[] denominatorAverage = {40,60,70,90};
//
//        double[] given = {110,10};
//        double actual = (linear.getDenominatorAverage(given));
//        assertEquals(11,actual);
//
//
//    }
}
