package SDA;

import java.util.*;

public class secLarge {
    Scanner sc = new Scanner(System.in);
    int n;
    int a[];

    void acc() {
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    void calc_dis() {
        Arrays.sort(a); // sorting puts the largest element at the end
        System.out.println("Second largest element: " + a[a.length - 2]); // displays the second last element
    }

    public static void main(String[] args) {
        secLarge obj = new secLarge();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
