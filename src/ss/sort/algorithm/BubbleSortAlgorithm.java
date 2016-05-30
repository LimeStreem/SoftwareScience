package ss.sort.algorithm;

/**
 * Created by LimeStreem on 5/30/16.
 */
public class BubbleSortAlgorithm<T> extends SortAlgorithm<T> {
    public BubbleSortAlgorithm(ISortComparer<T> comparer) {
        super(comparer);
    }

    @Override
    public void sort(T[] array) {
        for (int i = 0; i < array.length; i++)
        {
            for(int j = 1; j < array.length - i; j++)
            {
                if(!this.isSortedPair(array[j],array[j-1]))
                {
                    this.swap(array,j,j-1);
                }
            }
        }
    }
}
