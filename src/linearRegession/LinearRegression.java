package linearRegession;

public class LinearRegression {
        private double numeratorAverage;
        private double denominatorAverage;

    public double getNumeratorAverage(double[] x) {
        double sum = 0;
        for(int index = 0; index< x.length; index++){
            sum = sum + x[index];
            numeratorAverage = (double)sum/ x.length;
        }
        return numeratorAverage;
    }

    public double getDenominatorAverage(double[] array) {
        double sum = 0;
        for(int index = 0; index< array.length; index++){
            sum = sum + array[index];
            denominatorAverage = (double)sum/ array.length;
        }
        return denominatorAverage;
    }

    public double[] getSubtractedXAverage(double[] array) {
        double average = getNumeratorAverage(array);
        double [] differenceOfX = new double [array.length];

        for(int index =0; index < array.length;index++){
            differenceOfX[index] = array[index] - average;
        }
        return differenceOfX;
    }

    public double[] getSubtractedYAverage(double[] arrays) {
        double average = getDenominatorAverage(arrays);
        double [] differenceOfY = new double [arrays.length];

        for(int index =0; index < arrays.length;index++){
            differenceOfY[index] = arrays[index] - average;
        }
        return differenceOfY;
    }

    public double[] getMultipliedArray(double[] differenceOfX, double[] differenceOfY) {
        double[] product = new double[differenceOfX.length];

        for(int index = 0; index < differenceOfX.length; index++){
            product[index] = differenceOfX[index] * differenceOfY[index];
        }
        return product;
    }
}
