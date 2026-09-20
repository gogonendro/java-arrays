package DDA;

import java.util.*;

public class upTriangle {
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

        System.out.println("Elements of upper triangle:");
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) { // j = i skips the elements below the diagonal
                System.out.print(arr[i][j] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        upTriangle obj = new upTriangle();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
