package com.dsa.strivers.step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAdvance {

    public static void mergeSort(int[] arr, int low, int high) {

        if(low>=high) // At last level, when we have only single sub array size then for a[0] => low = 0 as well as high = 0,
                      // which means now array can't be divided.
            return;

        int mid = (low+high)/2;

        mergeSort(arr, low, mid); // left sub array for sorting
        mergeSort(arr, mid+1, high); // left sub array for sorting

        merge(arr, low, mid, high); // sort and merge

    }

    private static int[] merge(int[] arr, int low, int mid, int high) {
        int leftPointerForStartOfLeftSubArray = low;
        int rightPointerForStartOfRightSubsArray = mid+1;

        List<Integer> temp = new ArrayList<>();

        // compare elements of left and right subarray
        while (leftPointerForStartOfLeftSubArray <= mid && rightPointerForStartOfRightSubsArray <= high) {

            if(arr[leftPointerForStartOfLeftSubArray] <= arr[rightPointerForStartOfRightSubsArray]) {
                temp.add(arr[leftPointerForStartOfLeftSubArray]);
                leftPointerForStartOfLeftSubArray++;
            } else {
                temp.add(arr[rightPointerForStartOfRightSubsArray]);
                rightPointerForStartOfRightSubsArray++;
            }
        }

        while(leftPointerForStartOfLeftSubArray <= mid) {
            temp.add(arr[leftPointerForStartOfLeftSubArray]);
            leftPointerForStartOfLeftSubArray++;
        }
        while(rightPointerForStartOfRightSubsArray <= high) {
            temp.add(arr[rightPointerForStartOfRightSubsArray]);
            rightPointerForStartOfRightSubsArray++;
        }

        for(int i=low;i<=high;i++) {
            arr[i] = temp.get(i-low);
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 1, 3, 6, 28, 2};
        mergeSort(arr, 0, 7);
        Arrays.stream(arr).forEach(System.out::println);

    }
}
