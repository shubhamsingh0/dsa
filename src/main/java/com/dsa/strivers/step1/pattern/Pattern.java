package com.dsa.strivers.step1.pattern;

public class Pattern {


    /**
     * *****
     * *****
     * *****
     * *****
     * *****
     *
     * @param n
     */
    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * *
     * **
     * ***
     * ****
     * *****
     *
     * @param n
     */
    private static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *
     * 1
     * 12
     * 123
     * 1234
     * 12345
     *
     * @param n
     */
    private static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    /**
     * 1
     * 22
     * 333
     * 4444
     * 55555
     *
     * @param n
     */
    private static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    /**
     * *****
     * ****
     * ***
     * **
     * *
     *
     * @param n
     */
    private static void pattern5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 12345
     * 1234
     * 123
     * 12
     * 1
     *
     * @param n
     */
    private static void pattern6(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    /**
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     *
     * @param n
     */
    private static void pattern7(int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int temp = n;
        for (i=0; i<2*n; i=i+2) {

            for (j=0; j<temp-1; j++) {
                System.out.print(" ");
            }

            for (int l=0; l<=i; l++) {
                System.out.print("*");
            }
            for (k=0; k<temp-1; k++) {
                System.out.print(" ");
            }
            temp--;
            System.out.println();
        }
    }

    /**
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     *
     * @param n
     */
    private static void pattern8(int n) {
        int i=0,j=0,k=0,temp=0;
        for(i=2*n; i>0; i=i-2){

            for(j=0;j<temp;j++){
                System.out.print(" ");
            }

            for(int l=i-1;l>0;l--){
                System.out.print("*");
            }

            for(k=0;k<temp;k++){
                System.out.print(" ");
            }
            temp++;
            System.out.println();
        }
    }

    /**
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     *
     * @param n
     */
    private static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    /**
     * *
     * **
     * ***
     * ****
     * *****
     * ****
     * ***
     * **
     * *
     *
     * @param n
     */
    private static void pattern10(int n) {

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        pattern5(n);
    }

    /**
     * Pattern:
     *              1
     *              01
     *              101
     *              0101
     *              10101
     *
     *          Try to think in 2D Matrix and check at what index(i,j) has 1 and 0 resp. Try to find the pattern
     *          in i and j.
     *                 (0,0) = 1, (0,2) = 1, (0,4) = 1, (0,1) = 0, (0,3) = 0;
     *                 (1,0) = X, (1,1) = 1, (1,3) = 1, (1,2) = 0, (1,4) = 0;
     *                 (2,0) = X, (2,1) = X, (2,2) = 1, (2,4) = 1, (2,3) = 0;
     *          Looking at the pattern we can see that when i and j both are even or both are odd we have
     *          Value as 1 else its 0. e.g. (0[even],0[even]) = 1 but (0[even],1[odd]) = 0
     *
     * @param n number of rows for pattern to be displayed.
     */
    private static void pattern11(int n) {

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0)) {
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    /**
     * Pattern:
     *       1        1
     *       12      21
     *       123    321
     *       1234  4321
     *       1234554321
     * @param n number of rows for pattern to be displayed.
     */
    private static void pattern12(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            for(int j=n;j>0;j--){
                if(j>i)
                    System.out.print(" ");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * 1
     * 23
     * 456
     * 78910
     * 1112131415
     * @param n number of rows for pattern to be displayed.
     */
    private static void pattern13(int n) {
        int count=0;
        int totalNumber = 2*n+n;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<i+1;j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }

    /**
     * A
     * AB
     * ABC
     * ABCD
     * ABCDE
     *
     * @param n
     */
    private static void pattern14(int n) {

        for(int i=0;i<n;i++) {
            for(int j=65;j<65+i+1;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }

    /**
     * ABCDE
     * ABCD
     * ABC
     * AB
     * A
     *
     * @param n
     */
    private static void pattern15(int n) {
        for(int i=n-1;i>=0;i--){
            for(int j=65;j<65+i+1;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }

    /**
     * A
     * BB
     * CCC
     * DDDD
     * EEEEE
     *
     * @param n
     */
    private static void pattern16(int n) {
        int c = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)c);
            }
            c++;
            System.out.println();
        }
    }

    /**
     *     A
     *    ABA
     *   ABCBA
     *  ABCDCBA
     * ABCDEDCBA
     *
     * @param n number of rows for pattern to be displayed.
     */
    private static void pattern17(int n) {
        int c = 65;
        int temp = n;
        int back=n;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<temp-1;j++){
                System.out.print(" ");
            }

            for(int j=65;j<=65+i;j++){
                System.out.print((char)j);
            }
            if(i!=0) {
                for(int j=65+(i-1);j>=65;j--){
                    System.out.print((char)j);
                }
            }
            for(int j=0;j<temp-1;j++){
                System.out.print(" ");
            }
            temp--;
            System.out.println();
        }
    }

    /**
     * E
     * DE
     * CDE
     * BCDE
     * ABCDE
     *
     * @param n
     */
    private static void pattern18(int n) {
        int c=65+(n-1);
        for(int i=0;i<n;i++){
            for (int j = c-i; j <= c; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
        pattern18(5);
    }


}
