package DDA;

import java.util.*;

public class identity {
    Scanner sc = new Scanner(System.in);
    int n, i, j, l, arr[][];
    boolean isIden = true;

    void acc() {
        System.out.println("Enter n:");
        n = sc.nextInt();
        arr = new int[n][n];

        System.out.println("Enter the elements of the " + n + "x" + n + " square matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void calc() {
        System.out.println("Matrix:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        isIden = true;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j && arr[i][j] != 1) {
                    isIden = false; // main diagonal elements must be 1
                } else if (i != j && arr[i][j] != 0) {
                    isIden = false; // non-diagonal elements must be 0
                }
            }
        }
    }

    void dis() {
        if (isIden) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not Identity Matrix");
        }
    }

    public static void main(String[] args) {
        identity obj = new identity();
        obj.acc();
        obj.calc();
        obj.dis();
        obj.sc.close();
    }
}
