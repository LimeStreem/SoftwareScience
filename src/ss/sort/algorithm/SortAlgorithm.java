package ss.sort.algorithm;

import ss.sort.algorithm.ISortAlgorithm;
import ss.sort.algorithm.ISortComparer;

/**
 * Created by LimeStreem on 5/30/16.
 */
public abstract class SortAlgorithm<T> implements ISortAlgorithm<T> {
    protected final ISortComparer<T> comparer;

    public SortAlgorithm(ISortComparer<T> comparer){
        this.comparer = comparer;
    }

    protected boolean isSortedPair(T before,T after)
    {
        return this.comparer.compare(before,after) >= 0;
    }

    protected void swap(T[] target,int index1,int index2)
    {
        T temp = target[index1];
        target[index1] = target[index2];
        target[index2] = temp;
    }
}
