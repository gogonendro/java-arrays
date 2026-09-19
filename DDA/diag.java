package DDA;

import java.util.*;

public class diag {
    Scanner sc = new Scanner(System.in);
    int n, i, j, l, arr[][];

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

        System.out.println("Elements of primary diagonal:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i][i] + ", "); // primary diagonal element's indexes are [i][i]
        }
        System.out.println();

        System.out.println("Elements of secondary diagonal:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i][n - 1 - i] + ", "); // column's index is n-1-i (because for row 2, when n=4,
                                                        // col index: 4-1-2=1)
        }
    }

    public static void main(String[] args) {
        diag obj = new diag();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
