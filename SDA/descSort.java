package SDA;

import java.util.*;

public class descSort {
    Scanner sc = new Scanner(System.in);
    int arr[];
    int n, i, j, t = 0;

    void acc() {
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // bubble sort method
    void sort() {
        for (i = 0; i < n - 1; i++) { // runs from 0 to second last element of the array
            for (j = 0; j < n - i - 1; j++) { // runs from 0 to third last element of the array
                if (arr[j] < arr[j + 1]) { // if first element is smaller that the second, swap!
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    void dis() {
        System.out.println("Array in ascending order:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        descSort obj = new descSort();
        obj.acc();
        obj.sort();
        obj.dis();
        obj.sc.close();
    }
}
