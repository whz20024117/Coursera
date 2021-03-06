package com.sort;

public class Selection {
    public static void sort(Comparable[] a){
        int N = a.length;

        for (int i=0; i<N; i++){
            int min_i = i;

            for (int j=i+1;j<N;j++){
                if (less(a[j], a[min_i])) min_i = j;
            }
            exch(a, i, min_i);
        }
    }


    private static boolean less(Comparable v, Comparable w){
        //v<w
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
