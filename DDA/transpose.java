package DDA;

import java.util.*;

public class transpose {
    Scanner sc = new Scanner(System.in);
    int n, m, i, j, arr[][];

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

        System.out.println("Transposed matrix:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[j][i] + "\t"); // indices are swapped
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        transpose obj = new transpose();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
