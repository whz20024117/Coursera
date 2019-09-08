package com.sort;

public class BubbleSort {
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i = 0; i < N-1; i++){
            for (int j = 1; j < N-i; j++){
                if (less(a[j],a[j-1])) exch(a, j, j-1);
            }
        }
    }

    public static void sort_sida(Comparable[] a){
        int N = a.length;
        boolean swap = true;
        int k = 0;
        while (swap){
            swap = false;
            for (int j = 0; j < N - k - 1; j++){
                if (less(a[j+1], a[j])){
                    exch(a, j+1, j);
                    swap = true;
                }
             k++;
            }
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
