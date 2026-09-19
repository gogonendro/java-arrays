package DDA;

import java.util.*;

public class colSum {
    Scanner sc = new Scanner(System.in);
    int n, m, i, j, s, arr[][];

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

    void calc_dis() {
        System.out.println("Matrix:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // everything same as the row sum logic, only loop's order is changed
        for (j = 0; j < m; j++) {
            s = 0; // reset sum before starting new column

            for (i = 0; i < n; i++) {
                s = s + arr[i][j]; // add every element in the current column
            }
            System.out.println("Sum of elements in column " + (j + 1) + " = " + s);
        }
    }

    public static void main(String[] args) {
        colSum obj = new colSum();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
