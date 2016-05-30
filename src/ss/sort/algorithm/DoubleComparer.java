package ss.sort.algorithm;

/**
 * Created by LimeStreem on 5/30/16.
 */
public class DoubleComparer implements ISortComparer<Double> {

    @Override
    public double compare(Double a, Double b) {
        return a - b;
    }
}
