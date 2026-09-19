package DDA;

import java.util.*;

public class matMult {
    Scanner sc = new Scanner(System.in);
    int n, m, a, b, i, j, k, arr1[][], arr2[][], arr3[][];
    boolean mult = false;

    void acc() {
        System.out.println("Enter the number of rows and columns for first matrix:");
        n = sc.nextInt();
        m = sc.nextInt();
        arr1 = new int[n][m];

        System.out.println("Enter the elements of the " + n + "x" + m + " matrix 1:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns for second matrix:");
        a = sc.nextInt();
        b = sc.nextInt();
        arr2 = new int[a][b];

        System.out.println("Enter the elements of the " + a + "x" + b + " matrix 1:");
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        arr3 = new int[n][b]; // result matrix with dimensions n*b
    }

    void calc() {
        if (m != a) { // checks if multiplication possible
            mult = false;
            System.out.println("Matrices cannot be multiplied");
        } else {
            mult = true;

            // using 3 nested loops
            for (i = 0; i < n; i++) { // iterates through rows of arr1
                for (j = 0; j < b; j++) {// iterates through the cols of arr2
                    for (k = 0; k < m; k++) { // iterates through elements to calculate the product
                        arr3[i][j] += arr1[i][k] * arr2[k][j]; // adds to get the single entry
                    }
                }
            }
        }
    }

    void dis() {
        System.out.println("Matrix 1:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");

        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        if (mult) {
            System.out.println("After multiplication:");

            for (i = 0; i < n; i++) {
                for (j = 0; j < b; j++) {
                    System.out.print(arr3[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        matMult obj = new matMult();
        obj.acc();
        obj.calc();
        obj.dis();
        obj.sc.close();
    }
}
