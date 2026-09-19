package DDA;

import java.util.*;

public class diagSum {
    Scanner sc = new Scanner(System.in);
    int n, i, j, priSum = 0, secSum = 0, arr[][];

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

    void calc_dis() {
        System.out.println("Matrix:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (i = 0; i < n; i++) {
            priSum += arr[i][i]; // primary diagonal element's indexes are [i][i]
        }
        System.out.println("Sum of primary diagonal elements: " + priSum);

        for (i = 0; i < n; i++) {
            secSum += arr[i][n - 1 - i]; // column's index is n-1-i (because for row 2, when n=4,
                                         // col index: 4-1-2=1)
        }
        System.out.println("Sum of secondary diagonal elements: " + secSum);
    }

    public static void main(String[] args) {
        diagSum obj = new diagSum();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
