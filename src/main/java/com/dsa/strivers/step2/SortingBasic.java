package com.dsa.strivers.step2;

import java.util.Arrays;

public class SortingBasic {

    /**
     *
     * In selection sort we select the minimum and swap the current element with it and thus Brings the minimum to the front.
     * e.g Sort => 2, 13,4, 1, 3, 6, 28
     * 1 13 4 2 3 6 28 2
     * 1 2 4 13 3 6 28 2
     * 1 2 2 13 3 6 28 4
     * 1 2 2 3 13 6 28 4
     * 1 2 2 3 4 6 28 13
     * 1 2 2 3 4 6 28 13
     * 1 2 2 3 4 6 13 28
     * 1 2 2 3 4 6 13 28
     */
    public static int[] selectionSort(int[] arrToSort) {

        for (int i = 0; i < arrToSort.length; i++) {
            int min = i; // lets assume index i holds the minimum element value
            for (int j = i; j < arrToSort.length; j++) {
                if (arrToSort[j] < arrToSort[min]) {
                    min = j;
                }
            }
            int temp = arrToSort[min];
            arrToSort[min] = arrToSort[i];
            arrToSort[i] = temp;
            Arrays.stream(arrToSort).forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
        return arrToSort;
    }

    /**
     * Pushes the maximum at the last by doing the adjacent swap
     * e.g Sort => 2, 13,4, 1, 3, 6, 28, 2
     * 2 4 1 3 6 13 2 28
     * 2 1 3 4 6 2 13 28
     * 1 2 3 4 2 6 13 28
     * 1 2 3 2 4 6 13 28
     * 1 2 2 3 4 6 13 28
     * 1 2 2 3 4 6 13 28
     * 1 2 2 3 4 6 13 28
     * 1 2 2 3 4 6 13 28
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int didSwap =0; // for optimization, if in the first step which is from 0 to n-1,if we don't swap that means Array is already sorted.
            for (int j = 1; j < arr.length - i; j++) { // Why arr.length-i => It's because since we are moving the largest element at last by adjacent swap,
                                                       // those element are already sorted, that is why we are decrementing and repeating for the
                                                       // unsorted part of the array
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1; // swap happened
                }
            }
            Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
            System.out.println();

            if(didSwap == 0) { // When didSwap = 0, that means array is sorted as swap doesn't happen as the value is not 1.
                break;
            }

        }
        return arr;
    }

    /**
     *
     * Not sure what this sort is but it works. LOL!. I think its normal brute-force sort
     * 2 13 4 1 3 6 28 2
     * 2 13 4 1 3 6 28 2
     * 1 13 4 2 3 6 28 2
     * 1 13 4 2 3 6 28 2
     * 1 13 4 2 3 6 28 2
     * 1 13 4 2 3 6 28 2
     * 1 13 4 2 3 6 28 2
     * 1 4 13 2 3 6 28 2
     * 1 2 13 4 3 6 28 2
     * 1 2 13 4 3 6 28 2
     * 1 2 13 4 3 6 28 2
     * 1 2 13 4 3 6 28 2
     * 1 2 13 4 3 6 28 2
     * 1 2 4 13 3 6 28 2
     * 1 2 3 13 4 6 28 2
     * 1 2 3 13 4 6 28 2
     * 1 2 3 13 4 6 28 2
     * 1 2 2 13 4 6 28 3
     * 1 2 2 4 13 6 28 3
     * 1 2 2 4 13 6 28 3
     * 1 2 2 4 13 6 28 3
     * 1 2 2 3 13 6 28 4
     * 1 2 2 3 6 13 28 4
     * 1 2 2 3 6 13 28 4
     * 1 2 2 3 4 13 28 6
     * 1 2 2 3 4 13 28 6
     * 1 2 2 3 4 6 28 13
     * 1 2 2 3 4 6 13 28
     */
    public static int[] bubbleSortMyVersion(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
                System.out.println();
            }
        }
        return arr;
    }

    /**
     * In Insertion sort, we take the element and place it in correct order by moving to the left by adjacent swap till the picked
     * element is less than the previous element.
     * e.g. sort => 2, 13,4, 1, 3, 6, 28, 2
     * 2 13 4 1 3 6 28 2
     * 2 4 13 1 3 6 28 2
     * 1 2 4 13 3 6 28 2
     * 1 2 3 4 13 6 28 2
     * 1 2 3 4 6 13 28 2
     * 1 2 3 4 6 13 28 2
     * 1 2 2 3 4 6 13 28
     */
    public static int[] insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            for(int j=i; j>0 ;j--) { // here j>0 because we started from i=1. from i=1 which our current index by doing arr[j-1] as j=i
                                     // we can get to arr[1-0]=>arr[0]. If not will get ArrayIndexOutOfBound
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
            System.out.println();
        }

        return arr;
    }

    public static int[] insertionSortWhileLoopApproach(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
            Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
        return arr;
    }
    public static void main(String[] args) {
        Arrays.stream(selectionSort(new int[] {2, 13,4, 1, 3, 6, 28, 2})).forEach(System.out::println);
        Arrays.stream(bubbleSort(new int[]{2, 13, 4, 1, 3, 6, 28, 2})).forEach(System.out::println);
        Arrays.stream(bubbleSort(new int[]{1, 2, 3, 4, 5, 6, 7, 8})).forEach(System.out::println);
        Arrays.stream(bubbleSortMyVersion(new int[]{2, 13,4, 1, 3, 6, 28, 2})).forEach(System.out::println);
        Arrays.stream(insertionSort(new int[]{2, 13,4, 1, 3, 6, 28, 2})).forEach(System.out::println);
        Arrays.stream(insertionSortWhileLoopApproach(new int[]{2, 13,4, 1, 3, 6, 28, 2})).forEach(System.out::println);
    }
}