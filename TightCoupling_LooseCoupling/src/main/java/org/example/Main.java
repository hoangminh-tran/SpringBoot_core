package org.example;

public class Main {
    public static void main(String[] args) {
        VeryComplex business_1 = new VeryComplex(new BubbleSort());
        VeryComplex business_2 = new VeryComplex(new HeapSort());
        int arr[] = new int[100];
        business_1.complexBusiness(arr);
        business_2.complexBusiness(arr);

        // Set new Sort Alogrithm for business_2
        business_2.setSortAlgorithm(new BubbleSort());
        business_2.complexBusiness(arr);
    }
}