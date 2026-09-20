package DDA;

import java.util.*;

public class sparse {
    Scanner sc = new Scanner(System.in);
    int n, m, i, j, zC = 0, nzC = 0, arr[][];

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
        System.out.println("Matrix:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // set counter for zero and non-zero elements to 0
        zC = 0;
        nzC = 0;

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    zC++; // increase counter for zero element if found
                } else {
                    nzC++; // else increase counter for non-zero element
                }
            }
        }
    }

    void dis() {
        if (zC > nzC) {
            System.out.println("Sparse");
        } else {
            System.out.println("Not sparse");
        }
    }

    public static void main(String[] args) {
        sparse obj = new sparse();
        obj.acc();
        obj.calc();
        obj.dis();
        obj.sc.close();
    }
}
