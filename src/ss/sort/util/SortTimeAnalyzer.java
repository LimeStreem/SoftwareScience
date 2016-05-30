package ss.sort.util;

import ss.sort.algorithm.ISortAlgorithm;

/**
 * Created by LimeStreem on 5/30/16.
 */
public abstract class SortTimeAnalyzer<T> {
    protected final ISeedGenerator<T> seedGenerator;


    public SortTimeAnalyzer(ISeedGenerator<T> seedGenerator)
    {
        this.seedGenerator = seedGenerator;
    }

    protected double checkTime(ISortAlgorithm<T> sortAlgorithm,int n)
    {
        double begin = System.currentTimeMillis();
        T[] source = this.seedGenerator.generate(n);
        sortAlgorithm.sort(source);
        return System.currentTimeMillis() - begin;
    }

}
