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

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) // checking if the range > 1
        {
            int partitionIndex = getPartitionIndex(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);

        }
    }


    private static int getPartitionIndex(int[] arr, int low, int high) {
        int i = low;
        int j = high;

        int pivot = arr[low];

        while (i < j) {
            // get the first element greater than pivot from left
            while(arr[i]<=pivot && i<=high-1) {
                i++;
            }
            // get the first element less than pivot from right
            while(arr[j]>pivot && j>=low+1) {
                j--;
            }

            if(i<j) { // swap until j has not crossed i, once j crosses i that jth index is the partiotionIndex
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // we need to have j value to swap with pivot as it is the correct position of the pivot. Swap pivot with partition index 'j' element
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }


    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 1, 3, 6, 28, 2};

        mergeSort(arr, 0, 7);
        Arrays.stream(arr).forEach(System.out::println);

        quickSort(arr, 0, 7);
        Arrays.stream(arr).forEach(System.out::println);

    }
}
