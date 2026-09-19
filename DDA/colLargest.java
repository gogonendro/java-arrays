package DDA;

import java.util.*;

public class colLargest {
    Scanner sc = new Scanner(System.in);
    int n, m, i, j, l, arr[][];

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

        // everything same as the row largest logic, only loop's order is changed
        for (j = 0; j < m; j++) {
            l = arr[0][j]; // default assumption that first element of every column is the largest

            for (i = 1; i < n; i++) { // starts from second row because the first element is already assigned to l
                if (arr[i][j] > l) { // checks if any other element is larger than l
                    l = arr[i][j]; // if yes then replace l with that element
                }
            }
            System.out.println("Largest element in column " + (j + 1) + " = " + l);
        }
    }

    public static void main(String[] args) {
        colLargest obj = new colLargest();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
