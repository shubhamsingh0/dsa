package com.dsa.strivers.step1.recurssion.basic;

import java.util.Arrays;
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

    public static int[] generateFibonacciNumbers(int n) {
        int[] arr = new int[n];
        fib(n-1, arr); // decrement n by 1 for getting fibonacci till exact n as it the no of elements in array will be n+1 which leads to ArrayIndexOutOfBound
        return arr;
    }

    /**
     *
     * calling left function f(2)
     * f(1)
     * f(1)[0, 1, 0]
     * left function f(2) ended
     * Now calling right function f(2)
     * f(0)
     * f(0)[0, 1, 0]
     * right function f(2) ended
     * f(2)[0, 1, 1]
     *
     */
    public static int fib(int n, int[] arr) {
        if (n<=1) {
            arr[n] = n;
        }
        else {
            if (arr[n]==0) // checks if we already calculated fibonacci for f(n) as arr[n] will not be 0 in that case, and calculate only if arr[n] for f(n) is zero.
                // For f(0) and f(1) flow will not come inside else block
                arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
        }
        return arr[n];
    }

    public static void findSubsequence(int indexToBeTakenOrNotTaken, Stack<String> array, int n) {

//      SUBSEQUENCE: A contiguous/Non-Contiguous sequence which follows the order. Can be
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

        Arrays.stream(generateFibonacciNumbers(2)).asLongStream().forEach(System.out::println);

        fibonacciSeriesTillN(3);

        Stack<String> outputArray = new Stack<>();
        findSubsequence(0,outputArray,intArray.length);
    }
}
