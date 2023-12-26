package com.dsa.strivers.step1.recurssion.easy;

import java.util.Arrays;

public class RecursionEasy {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        addElementsInAnArray(x, 1, arr);
        return arr;
    }

    public static void addElementsInAnArray(int x, int i, int[] arr) {
        if(i > x) {
            return;
        }

        addElementsInAnArray(x, i+1, arr); // if you write ++i then it will increment first and will give index out of bound

        arr[i-1] = i;
    }


    public static void main(String[] args) {
        Arrays.stream(printNos(5)).forEach(System.out::println);
    }
}
