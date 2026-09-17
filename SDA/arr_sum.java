package SDA;

import java.util.*;

public class arr_sum {
    Scanner sc = new Scanner(System.in);
    int n;
    int a[];
    int s = 0;

    void acc() {
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    void sum_dis() {
        for (int i = 0; i < n; i++) {
            s = s + a[i];
        }
        System.out.println("Sum of the elements: " + s);
    }

    public static void main(String[] args) {
        arr_sum obj = new arr_sum();
        obj.acc();
        obj.sum_dis();
        obj.sc.close();
    }
}
