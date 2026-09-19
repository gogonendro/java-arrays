package SDA;

import java.util.*;

public class merge {
    Scanner sc = new Scanner(System.in);
    int n, m, i, a[], b[], r[];

    void acc() {
        System.out.println("Enter the number of elements of the first array:");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements of the second array:");
        m = sc.nextInt();
        b = new int[m];

        System.out.println("Enter " + m + " numbers:");
        for (i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
    }

    void mergeArr_dis() {
        r = new int[n + m]; // result array has the length = sum of array 'a' and 'b'
        for (i = 0; i < n; i++) {
            r[i] = a[i]; // copy the elements of 'a' into 'r'
        }
        for (i = 0; i < m; i++) {
            r[n + i] = b[i]; // index of r beginds with (n+i), so that it continues after the elements of 'a'
        }

        System.out.println("Merged array:");
        for (i = 0; i < n + m; i++) {
            System.out.println(r[i]);
        }
    }

    public static void main(String[] args) {
        merge obj = new merge();
        obj.acc();
        obj.mergeArr_dis();
        obj.sc.close();
    }
}
