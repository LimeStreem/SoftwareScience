package ss.sort.util;

/**
 * Created by LimeStreem on 5/30/16.
 */
public class DoubleSeedGenerator implements ISeedGenerator<Double> {

    public double max;

    public DoubleSeedGenerator(double max)
    {
        this.max = max;
    }

    @Override
    public Double[] generate(int n) {
        Double[] seeds = new Double[n];
        for (int i = 0; i < n; i++) {
            seeds[i] = Math.random() * max;
        }
        return seeds;
    }
}
