package com.dsa.strivers.step1.recurssion.basic;

import java.util.Stack;

public class MultipleRecursionCall {
// If there are multiple recursion calls to be done, one function is ended then only next comes,
// Before ending the previous recursion, next can never ever execute.
static int[] intArray = new int[]{ 1,2,3 };
    public static long fibonacciSeriesTillN(int n) {
        if(n<=1) {
            return n;
        }

        return fibonacciSeriesTillN(n-1)+fibonacciSeriesTillN(n-2);
    }

    public static void findSubsequence(int indexToBeTakenOrNotTaken, Stack<String> array, int n) {

//      SUBSEQUENCE: A contiguous/Non Contiguous sequence which follows the order. Can be
//      implemented using Power Sets or recursion.

        if(indexToBeTakenOrNotTaken == intArray.length) {
            System.out.println(array);
            return;
        }
        // take or pick the particular index into the subsequence.
        array.push(String.valueOf(intArray[indexToBeTakenOrNotTaken]));
        findSubsequence(indexToBeTakenOrNotTaken+1, array, n);
        array.pop();

        // not pick, or not take condition, this element is not added to your subsequence
        findSubsequence(indexToBeTakenOrNotTaken+1, array, n);
    }

    public static void printSubsequenceWhoseSumIsK(int indexToBeTakenOrNotTaken, Stack<String> array, int n) {
    // Remember: the technique to always print only one answer is to by returning boolean from the
    // base case. If condition is satisfied return true, else false. Now whenever you do
    // a function call put that into if condition If(f()==true) f() return false then
    // return true. no need to go beyond.

    }
    public static void main(String[] args) {

        Stack<String> outputArray = new Stack<>();
//        System.out.println(fibonacciSeriesTillN(4));
        findSubsequence(0,outputArray,intArray.length);
    }
}
