package edu.neu.coe.info6205.sort.elementary;

import java.util.Arrays;

/**
 * This is a basic implementation of insertion sort.
 * It does not extend Sort, nor does it employ any optimizations.
 */
public class InsertionSortBasic {

    public int[] sort(int[] a) {
        sort(a, 0, a.length);
        return a;
    }

    public void sort(int[] a, int lo, int hi) {
        for (int i = lo + 1; i < hi; i++) swap(i, a);
       
    }

    private void swap(int i, int[] a) {
        // TO BE IMPLEMENTED
    	for(int k=i;k>0;k--)
    	{
	    	if(a[k] < a[k-1])
	    	{
	    		swap(a,k-1,k);
	    		
	    	}
    	}
    }

    private void swap(int[] a, int j, int i) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    public static void main(String[] args) {
        InsertionSortBasic sorter = new InsertionSortBasic();
        int[] a = {4,3,2,10,12,1,5,6};
        System.out.println(Arrays.toString(a));
        
        System.out.println(Arrays.toString(sorter.sort(a)));
    }
}
