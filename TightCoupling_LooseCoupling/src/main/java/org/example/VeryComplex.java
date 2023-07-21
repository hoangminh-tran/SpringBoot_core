package org.example;

public class VeryComplex {
    private SortAlgorithm sortAlgorithm;

    public VeryComplex(SortAlgorithm sortAlgorithm)
    {
        this.sortAlgorithm = sortAlgorithm;
    }

    public SortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void complexBusiness(int arr[])
    {
        sortAlgorithm.sort(arr);
    }
}
