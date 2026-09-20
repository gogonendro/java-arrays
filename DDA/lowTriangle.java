package DDA;

import java.util.*;

public class lowTriangle {
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

        System.out.println("Elements of lower triangle:");
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) { // j <= i stops iteration at the diagonal
                System.out.print(arr[i][j] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        lowTriangle obj = new lowTriangle();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
