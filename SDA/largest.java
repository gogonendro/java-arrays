package SDA;

import java.util.*;

public class largest {
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
        System.out.println("Largest element: " + a[a.length - 1]); // displays the end element
    }

    public static void main(String[] args) {
        largest obj = new largest();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
