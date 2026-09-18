package SDA;

import java.util.*;

public class secSmall {
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
        Arrays.sort(a); // sorting puts the smallest element at the beginning
        System.out.println("Second smallest element: " + a[1]); // displays the second element
    }

    public static void main(String[] args) {
        secSmall obj = new secSmall();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
