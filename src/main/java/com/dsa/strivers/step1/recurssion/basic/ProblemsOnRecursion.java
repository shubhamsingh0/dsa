package com.dsa.strivers.step1.recurssion.basic;

import java.util.Arrays;
import java.util.Stack;

public class ProblemsOnRecursion {

    public static void printSubSequence(int i, Stack<Character> temp, char[] string) {
        if(i==string.length) {
            System.out.println(temp);
            return;
        }
        temp.push(string[i]);
        printSubSequence(i+1,temp,string);
        temp.pop();
        printSubSequence(i+1,temp,string);
    }

    public static int countSubSequence(int i, char[] string) {
        if(i==string.length) {
            return 1;
        }
        int l = countSubSequence(i+1, string);
        int r = countSubSequence(i+1, string);
        return l+r;
    }

    public static int NumberOfSubsequenceWhoseSumIsK(int i, int[] num, int sum, int k) {
        if(i==num.length) {
            if(sum == k)
                return 1;
            else
                return 0;
        }

        sum = sum + num[i];
        int l = NumberOfSubsequenceWhoseSumIsK(i+1, num, sum, k);
        sum = sum - num[i];
        int r = NumberOfSubsequenceWhoseSumIsK(i+1, num, sum, k);
        return l+r;
    }
    public static int printNumberOfSubsequenceWhoseSumIsK(int i, int[] num, Stack<Integer> temp, int sum, int k) {
        if(i==num.length) {
            if(sum == k) {
                System.out.println(temp);
                return 1;
            }
            else
                return 0;
        }
        temp.push(num[i]);
        sum = sum + num[i];
        int l = printNumberOfSubsequenceWhoseSumIsK(i+1, num,temp, sum, k);
        sum = sum - num[i];
        temp.pop();
        int r = printNumberOfSubsequenceWhoseSumIsK(i+1, num,temp, sum, k);
        return l+r;
    }

    public static boolean printOnlyFirstSubsequenceWhoseSumIsK(int i, int[] num, Stack<Integer> temp, int sum, int k) {
        if(i==num.length) {
            if(sum == k) {
                System.out.println(temp);
                return true;
            }
            else
                return false;
        }
        temp.push(num[i]);
        sum = sum + num[i];
        if(printOnlyFirstSubsequenceWhoseSumIsK(i+1,num,temp,sum,k)){
            return true;
        }
        sum = sum -num[i];
        temp.pop();
        if(printOnlyFirstSubsequenceWhoseSumIsK(i+1,num,temp,sum,k)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = new int[] {1,2,3,4};
        Stack<Character> temp = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();
        printSubSequence(0, temp, "Shubham".toCharArray());
        System.out.println(countSubSequence(0,"123".toCharArray()));
        System.out.println(NumberOfSubsequenceWhoseSumIsK(0, num,0,3 ));
        System.out.println(printNumberOfSubsequenceWhoseSumIsK(0, num, temp2,0,3 ));
        System.out.println(printOnlyFirstSubsequenceWhoseSumIsK(0, num, temp2,0,3 ));
    }
}
