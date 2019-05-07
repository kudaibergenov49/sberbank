package task4;

import task1.MyException;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Algorithm {

    public static void main(String[] args) {
        double[] arr = new double[]{1.1, 3.2, 8.8, 9.0};
        System.out.println(foo(arr));
        System.out.println(fooStream(arr));

    }

    private static double foo(double[] sourceArray) throws MyException {
        double min = sourceArray[0];
        double max = sourceArray[0];
        double average;
        double sum = 0;
        for (double value : sourceArray) {
            min = min < value ? min : value;
            max = max > value ? max : value;
            sum = sum + value;
        }
        average = sum / sourceArray.length;
        return (max - min) / average;
    }

    private static double fooStream(double[] sourceArray) throws MyException {
        List<Double> listArray = Arrays.stream(sourceArray).boxed().collect(Collectors.toList());
        DoubleSummaryStatistics stats = listArray.stream().mapToDouble((x) -> x).summaryStatistics();
        return (stats.getMax() - stats.getMin()) / stats.getAverage();
    }
}
