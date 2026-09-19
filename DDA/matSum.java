package DDA;

import java.util.*;

public class matSum {
    Scanner sc = new Scanner(System.in);
    int n, m, i, j, arr1[][], arr2[][], arr3[][];

    void acc() {
        System.out.println("Enter the number of rows and columns of matrices:");
        n = sc.nextInt();
        m = sc.nextInt();
        arr1 = new int[n][m];
        arr2 = new int[n][m];

        System.out.println("Enter the elements of the " + n + "x" + m + " matrix 1:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the " + n + "x" + m + " matrix 2:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        arr3 = new int[n][m];
    }

    void calc_dis() {
        System.out.println("Matrix 1:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j]; // adds the elements of both the arrays
            }
        }

        System.out.println("Sum of matrices:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matSum obj = new matSum();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
