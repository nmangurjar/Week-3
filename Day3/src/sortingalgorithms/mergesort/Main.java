package sortingalgorithms.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] bookPrices = {399.99, 249.50, 599.75, 150.25, 299.99, 99.99, 450.00};

        //Print original Prices
        System.out.println("Original Prices : "+Arrays.toString(bookPrices));

        //Sort the prices
        MergeSort.mergeSort(bookPrices,0, bookPrices.length-1);

        //Print the sorted Prices
        System.out.println("Sorted Prices : "+Arrays.toString(bookPrices));


    }
}
