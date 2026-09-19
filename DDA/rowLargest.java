package DDA;

import java.util.*;

public class rowLargest {
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

        for (i = 0; i < n; i++) {
            l = arr[i][0]; // default assumption that first element of every row is the largest

            for (j = 1; j < m; j++) { // starts from second element because the first element is already assigned to l
                if (arr[i][j] > l) { // checks if any other element is larger than l
                    l = arr[i][j]; // if yes then replace l with that element
                }
            }
            System.out.println("Largest element in row " + (i + 1) + " = " + l);
        }
    }

    public static void main(String[] args) {
        rowLargest obj = new rowLargest();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
