package com.dsa.strivers.step1.basics.basicmaths;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasicMaths {

    /**
     * N = 0  - 10^6
     *
     * N = 12345
     *
     * 12345 /10 = 1234 count = 1
     * 1234/10 = 123 count = 2
     * 123/10 = 12 count =3
     * 12/10 = 2 count = 4
     * 2/10 = 0; count = 5
     *
     *
     * public static int countDigits (int n) {
     * 	int count = 0;
     * Int quotient = 0;
     * 	while(n != 0) {
     * 		quotient = n/10;
     * 		N = quotient;
     * count++;
     *        }
     * }
     * 12345
     * q=1234
     * n=1234
     * C =1
     *
     * 1234
     * q=123
     * n=123
     * C =2
     *
     * 123
     * q=12
     * n=12
     * C =3
     *
     * 12
     * q=1
     * n=1
     * C =4
     *
     * 1
     * q=0
     * n=0
     * C =5
     *
     *
     * Time Complexity: O(n)
     *
     * @param n
     * @return
     */

    public static int countDigits (int n) {
        int count = 0;
        int quotient = 0;
        if(n==0) {
            return 1;
        }
        while(n != 0) {
            n = n/10;
            count++;
        }
        return count;
    }

    /**
     *
     * Use logarithm base 10 to count the number of digits. As
     * The number of digits in an integer = the upper bound of log10(n).
     * Time Complexity: O(1)
     * We add + 1 because the value of log10(n) is less than the number of digits by 1
     * @param n
     * @return
     */
    public static int countDigitsUsingLogarithmBase10(int n) {
        return (int ) Math.floor(Math.log10(n))+1;
    }

    /**
     *
     * It's a faster approach with Time complexity of O(1)
     *
     * @param n
     * @return
     */
    public static int countDigitsUsingString(int n) {

        return Integer.toString(n).length();
    }

    /**
     *
     * Time Complexity: O(log(n))
     *
     * @param n
     * @return
     */
    public static int reverseNumber(int n) {

        int reverseNumber = 0;
        int rem = 0;
        int q = 0;
        while(n!=0){
            rem = n%10; // To extract the last digit, if you divide a number by 10, then the remainder will be the last digit.
            n = n/10;   // To reduce the number by one digit from the end, simply divide the number by 10.

            // To create a number from digits: The idea is to start with 0, and for every digit,
            // multiply the number generated so far by 10, and add the digit to it.
            reverseNumber = (reverseNumber * 10) + rem;
        }

        return reverseNumber;
    }

    public static boolean isPalindromeNumber(int n) {
        boolean isPalindromeNumber = false;
        int reverseNumber = 0;

        if(n>=0 && n<10) {
            isPalindromeNumber =  true;
        } else {
            int num = n;

            while(num != 0) {
                int rem = num % 10;
                num = num / 10;
                reverseNumber = reverseNumber * 10 + rem;
            }

            if(n == reverseNumber)
                isPalindromeNumber = true;
        }

        return isPalindromeNumber;
    }

    public static int getHCFOrGCD(int n, int m) {
        int rem = -1;
        if(n == m || n ==0 || m == 0) {
            return n;
        }
        while(rem!=0) {
            if(n>m) {
                rem = n%m;
                n = m;
                m = rem;
            } else {
                rem = m%n;
                m = n;
                n = rem;
            }
        }

        return n!=0? n: m;
    }

    /**
     *
     * Gcd is the greatest number which is divided by both a and b.If a number is divided by both a and b, it should be divided by (a-b) and b as well.
     *
     * gcd(a,b) -< Either a can be divisor or b can be divisor. Generally we pick min(a,b) to be divisor and other one would be dividend.
     * a = 24, b = 84
     * gcd(a,b) => Think about the next step, the dividend will be the previous divisor and remainder will be the new divisor.
     * e.g. if we take a as divisor and b as dividend where a<b
     * gcd(a,b) = gcd(remainder, previous divisor)
     * gcd(a,b) = gcd(b%a, a) if a == 0 return b;
     *
     * e.g. if we take b as divisor and a as dividend where b<a
     * gcd(a,b) = gcd(previous divisor, remainder)
     * gcd(a,b) = gcd(b, a%b) if b == 0 return a;
     *
     * It depends on which we are treating as a divisor and dividend.
     * Time Complexity: O(logɸmin(a,b))
     * @param a
     * @param b
     * @return
     */
    public static int getHcfOrGcdUsingRecursion(int a, int b) {

        if(a == 0) {
            return b;
        }
        System.out.println("a: " + a + " b: " + b + " b%a = "+ b%a);
        return getHcfOrGcdUsingRecursion(b%a, a);
    }

    public static int gcdSimple(int a, int b) {

        while(a > 0 && b >0) {
            if(a>b)
                a = a%b;
            else
                b = b%a;
        }

        if(a==0)
            return b;

        return a;
    }

    /**
     * Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number.
     * 153 = 1^n + 5^n + 3^n where n = number of digits
     * e.g Some Armstrong numbers: 0, 1, 153, 370, 371, 407, and 1634
     * @param n
     */
    public static boolean checkArmstrongNumber(int n) {
        int temp = n;
        int count = 0;
        int sum = 0;
//        while(temp!=0) {
//            temp = temp/10;
//            count++;
//        }
        count = (int) Math.floor(Math.log10(n)) + 1;
        temp = n;
        while(temp>0) {
            int digit = temp%10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp/10;
        }
       if(sum == n)
           return true;

       return false;
    }

    /**
     *
     * The quotient of a division by one of the divisors is actually another divisor. Like, 4 divides 36. The quotient is 9, and 9 also divides 36.
     * Another intuition is that the root of a number actually acts as a splitting part of all the divisors of a number.
     * Also, the quotient of a division by any divisor gives an equivalent divisor on the other side. Like, 4 gives 9 while dividing 36.
     *
     * @param n
     */
    public static void printAllFactorsOfANumber(int n) {
        int limit = (int) Math.sqrt(n);
        for(int i=1;i<=limit;i++) {
            if(n%i==0) {
                if (i != n / i)
                    System.out.print(i + " " + n / i + " ");
                else
                    System.out.print(i);
            }
        }
    }

    /**
     *
     *
     * @param n
     */
    public static boolean printPrimeNumbers(int n) {

        for(int i=2; i<=Math.sqrt(n);i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345));
        System.out.println(countDigitsUsingString(12345));
        System.out.println(countDigitsUsingLogarithmBase10(12345));

        System.out.println(reverseNumber(12345));
        System.out.println(isPalindromeNumber(188908881));
        System.out.println(getHCFOrGCD(35, 85));
        System.out.println(getHcfOrGcdUsingRecursion(35, 85));
        System.out.println(gcdSimple(85, 35));
        System.out.println(checkArmstrongNumber(407));
        printAllFactorsOfANumber(361);
        System.out.println();
        System.out.println(printPrimeNumbers(53));

    }
}
