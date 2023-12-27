package com.dsa.strivers.step1.recurssion.basic;

import java.util.*;
import java.util.stream.IntStream;

public class Hashing {

    /**
     * character hashing -> initialize array with 256 character. hash[charArray[i]]++ where hash is int[]. but if its for smaller case
     * hash[charArray[i]-'a']++
     */
    private static int[] countFrequencyUsingArray(int n, int x, int[] nums) {
        int[] hash = new int[10000000];
        int[] returnArr = new int[n];

        // preStoring
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }

        // fetching
        for (int i = 1; i <= n; i++) {
            returnArr[i - 1] = hash[i];
        }

        return returnArr;
    }

    /**
     * Use to hash large numbers more than 10^9 or higher , uses less memory than array hashing as no. of unique
     * elements will be the length of map
     * <p>
     * best/average time complexity = O(1) insertion/retrieval
     * worst case time complexity = O(n)
     */
    public static int[] countFrequencyUsingMap(int n, int x, int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], 1);
            }
        }

        return IntStream.range(1, n + 1).map(i -> hash.getOrDefault(i, 0)).toArray();
    }

    /**
     * This is for general purpose which can be optimized for small and upper case scenarios. Same can be done using Map.
     */
    private static int countFrequencyOfCharactersInAStringUsingArray(String str, char toFetch) {
        int[] hash = new int[256];

        // preStoring
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        // fetching
        return hash[toFetch];


    }

    public static int[] getHighestAndLowestFrequencyElements(int[] v) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < v.length; i++) {
            if (hash.containsKey(v[i])) {
                hash.put(v[i], hash.get(v[i]) + 1);
            } else {
                hash.put(v[i], 1);
            }
        }

        System.out.println(hash);
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int highestElementPicked = Integer.MIN_VALUE;
        int lowestElementPicked = Integer.MAX_VALUE;

        // There are multiple cases:
        // case 1: the highest frequency value is less than current value, the current value will be highest frequency value
        // and simply the highestElementPicked will be that element/key initially.
        // case 2: when the highest frequency value is same as the current value, then we need to minimize the highestElementPicked
        // by making sure that the current key is less than the previous highestPickedValue, so that this current value can be assigned
        // as new highestPickedValue. and vice versa for lowestElementPicked;

        for (Map.Entry<Integer, Integer> element : hash.entrySet()) {
            if (highest < element.getValue()) {
                highest = element.getValue();
                highestElementPicked = element.getKey();
            } else if(highest == element.getValue()) {
                if (highestElementPicked > element.getKey()) {
                    highestElementPicked = element.getKey();
                }
            }
            if (lowest > element.getValue()) {
                lowest = element.getValue();
                lowestElementPicked = element.getKey();
            } else if (lowest == element.getValue()) {
                if(lowestElementPicked > element.getKey()) {
                    lowestElementPicked = element.getKey();
                }
            }
        }

        return new int[]{highestElementPicked, lowestElementPicked};
    }

    public static void main(String[] args) {
        Arrays.stream(countFrequencyUsingMap(10, 14, new int[] {11, 14, 8, 3, 12, 14, 1, 7, 4, 3 })).forEach(System.out::println);
        Arrays.stream(countFrequencyUsingArray(10, 14, new int[] {11, 14, 8, 3, 12, 14, 1, 7, 4, 3 })).forEach(System.out::println);
        System.out.println(countFrequencyOfCharactersInAStringUsingArray("Shubham Kumar Singh???", '?'));
        Arrays.stream(getHighestAndLowestFrequencyElements(new int[]{11, 13, 3, 14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3})).forEach(System.out::println);
    }
}
