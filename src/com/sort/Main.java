package com.sort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer[] a = {1,5,2,3,4};
        //Integer[] a = get_ints();
        long start = System.nanoTime();
        BubbleSort.sort_sida(a);
        long finish = System.nanoTime();
        //for(int i: a) System.out.println(i);
        System.out.println("Time used: "+(finish-start)*1e-9);
        System.out.println(isSorted(a));
    }

    private static Integer[] get_ints(){
        Random rd = new Random(100);
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt();
        }
        return arr;
    }

    private static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
}
