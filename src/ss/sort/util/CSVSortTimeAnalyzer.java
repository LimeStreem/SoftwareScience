package ss.sort.util;

import ss.sort.algorithm.ISortAlgorithm;

/**
 * Created by LimeStreem on 5/30/16.
 */
public class CSVSortTimeAnalyzer<T> extends SortTimeAnalyzer<T> {
    public CSVSortTimeAnalyzer(ISeedGenerator<T> seedGenerator) {
        super(seedGenerator);
    }

    public String getReport(ISortAlgorithm<T> algorithm,int n,int stride)
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i+= stride) {
//            builder.append(i);
//            builder.append(",");
//            builder.append(this.checkTime(algorithm,i));
//            builder.append(",\n");
            System.out.print(i);
            System.out.print(",");
            System.out.print(this.checkTime(algorithm,i));
            System.out.print(",\n");
        }
        return builder.toString();
    }
}
