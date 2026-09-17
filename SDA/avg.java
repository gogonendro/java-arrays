package SDA;

import java.util.*;

public class avg {
    Scanner sc = new Scanner(System.in);
    int n;
    int a[];
    int avg = 0;

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
            avg = avg + a[i];
        }
        System.out.println("Average of the elements: " + (avg / a.length));
    }

    public static void main(String[] args) {
        avg obj = new avg();
        obj.acc();
        obj.sum_dis();
        obj.sc.close();
    }
}
