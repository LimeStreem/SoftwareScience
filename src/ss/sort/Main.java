package ss.sort;

import ss.sort.algorithm.BubbleSortAlgorithm;
import ss.sort.algorithm.DoubleComparer;
import ss.sort.algorithm.ISortAlgorithm;
import ss.sort.util.CSVSortTimeAnalyzer;
import ss.sort.util.DoubleSeedGenerator;

public class Main {


    public static void main(String[] args) {
        ISortAlgorithm<Double> sorter = new BubbleSortAlgorithm<>(new DoubleComparer());
        CSVSortTimeAnalyzer<Double> analyzer = new CSVSortTimeAnalyzer<>(new DoubleSeedGenerator(10000));
        System.out.println(analyzer.getReport(sorter,1000000,1000));
    }
}
