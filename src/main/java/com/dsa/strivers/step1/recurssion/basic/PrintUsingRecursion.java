package com.dsa.strivers.step1.recurssion.basic;

import java.util.Arrays;

public class PrintUsingRecursion {

    public static void printName5Times(int i, String name) {
        if(i==5)
            return;
        System.out.print(name);
        printName5Times(++i, name);
    }

    public static void printLinearlyFrom1ToN(int i, int n) {
        if(i>n)
            return;
        System.out.print(i);
        printLinearlyFrom1ToN(++i,n);
    }

    public static void printLinearlyFromNTo1(int n) {
        if(n==0)
            return;
        System.out.print(n);
        printLinearlyFromNTo1(--n);
    }

    public static void printLinearlyFrom1ToNByBacktracking(int n) {
//    In backtracking we do our stuff after the recursive function call basically
//    we make sure that the last line is executed first for a particular function by calling a
//    function before the last line, until and unless that function doesn't meet the break
//    condition our that line will never execute.
//        In recursion while going, things happen while
//        In backtracking, in coming back things happen, that's why the term backtracking.
//        In decreasing order
        if(n==1)
            return;
         printLinearlyFrom1ToNByBacktracking(--n);
         System.out.println(n);


    }

    public static void printLinearlyFromNTo1ByBacktracking(int i, int n) {

        if(i>n)
            return;

        printLinearlyFromNTo1ByBacktracking(++i, n);
        System.out.println(i);

    }

    public static void printSumOfNNumbersUsingParameterized(int n, int sum) {
        // used mostly when we want to print the output by storing/updating the result
        // through/via a parameter
        if(n==0) {
            System.out.println("Sum : "+sum);
            return;
        }
        printSumOfNNumbersUsingParameterized(n-1,sum+n);
    }

    public static int printSumOfNNumbersUsingFunctional(int n) {
        // used mostly when we want to return the output. Mostly in case of DP
        // break the function into small function
        if(n==0)
            return 0;
        return n + printSumOfNNumbersUsingFunctional(n-1);
    }

    public static void printArrayInReverse(int i, int[] array) {
        if(i==array.length) {
            return;
        }
        printArrayInReverse(i+1,array);
        System.out.println(array[i]);
    }



    public static int[] reverseAnArray(int i, int j, int[] array) {
        if(i>=j)
            return array;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return reverseAnArray(i+1,j-1,array);
    }

    public static int[] reverseAnArrayUsingBackTracking(int i, int j, int[] array) {
       if(i== array.length-1 && j==0)
           return array;
        array = reverseAnArrayUsingBackTracking(i+1,j-1,array);
        if(i<=j)
            return array;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static boolean checkPalindrome(int i, int j, String str) {
        if(i>=j)
            return true;
        if(str.charAt(i)!=str.charAt(j))
            return false;
        return checkPalindrome(i+1,j-1,str);
    }

    public static void main(String[] args) {
//        String checkPalindromeString = "MAMA";
//        printName5Times(0,"Shubham");
//        printLinearlyFrom1ToN(1,10);
//        printLinearlyFromNTo1(3);
//        printLinearlyFrom1ToNByBacktracking(5);
//        printLinearlyFromNTo1ByBacktracking(0,5);
//        printSumOfNNumbersUsingParameterized(3,0);
//        System.out.println(printSumOfNNumbersUsingFunctional(3));
//
//        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
//        printArrayInReverse(0,intArray);
//        System.out.println(Arrays.toString(reverseAnArray(0, intArray.length - 1, intArray)));
//        System.out.println("With Backtracking: "+Arrays.toString(reverseAnArrayUsingBackTracking(0, intArray.length - 1, intArray)));
//        System.out.println(checkPalindrome(0,checkPalindromeString.length()-1,checkPalindromeString));
//        printNos(5);

    }
    public static int printNos(int x) {
        if(x==0)
            return x;

        int a = printNos(x-1);
        System.out.println(a);
        return a;
    }
}
