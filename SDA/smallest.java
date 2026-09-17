package SDA;

import java.util.*;

public class smallest {
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
        System.out.println("Smallest element: " + a[0]); // displays the first element
    }

    public static void main(String[] args) {
        smallest obj = new smallest();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
