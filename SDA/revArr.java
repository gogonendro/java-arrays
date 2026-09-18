package SDA;

import java.util.*;

public class revArr {
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

    void rev() {
        System.out.println("Reversed Array:");
        for (int i = a.length - 1; i >= 0; i--) { // loop runs backwards
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        revArr obj = new revArr();
        obj.acc();
        obj.rev();
        obj.sc.close();
    }
}
