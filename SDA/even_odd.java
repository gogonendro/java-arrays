package SDA;

import java.util.*;

public class even_odd {
    Scanner sc = new Scanner(System.in);
    int n;
    int a[];
    int ec = 0;
    int oc = 0;

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
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                ec++;
            } else {
                oc++;
            }
        }
        System.out.println("Number of even numbers: " + ec + "\n Number of odd numbers: " + oc);
    }

    public static void main(String[] args) {
        even_odd obj = new even_odd();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
