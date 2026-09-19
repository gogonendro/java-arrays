package SDA;

import java.util.*;

public class rotate {
    Scanner sc = new Scanner(System.in);
    int n, i, f, arr[];

    void acc() {
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void rot() {
        System.out.println("Original array:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        f = arr[0]; // set the first element as the element at 0
        for (i = 0; i < n - 1; i++) { // runs till last element
            arr[i] = arr[i + 1]; // shifts the element to left
        }
        arr[n - 1] = f; // set last element as first element
    }

    void dis() {
        System.out.println("\n Array after rotation:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        rotate obj = new rotate();
        obj.acc();
        obj.rot();
        obj.dis();
        obj.sc.close();
    }
}
