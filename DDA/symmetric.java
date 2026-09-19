package DDA;

import java.util.*;

public class symmetric {
    Scanner sc = new Scanner(System.in);
    int n, m, i, j, arr[][];
    boolean isSym = false;

    void acc() {
        System.out.println("Enter the number of rows and columns:");
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];

        System.out.println("Enter the elements of the " + n + "x" + m + " matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void calc() {
        // matrix must be square to be symmetric, therefore n = m
        if (n != m) {
            isSym = false;
            return; // exit method
        }

        isSym = true; // default assumption that matrix is symmetric

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr[i][j] != arr[j][i]) {
                    isSym = false; // one unequal pair is enough to declare asymmetric
                    return;
                }
            }
        }
    }

    void dis() {
        System.out.println("Matrix:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        if (isSym) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Not Symmetric");
        }
    }

    public static void main(String[] args) {
        symmetric obj = new symmetric();
        obj.acc();
        obj.calc();
        obj.dis();
        obj.sc.close();
    }
}
