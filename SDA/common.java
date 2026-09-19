package SDA;

import java.util.*;

public class common {
    Scanner sc = new Scanner(System.in);
    int n, m, i, j, a[], b[], r[];

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

    void findCom_dis() {
        System.out.println("Common elements:");
        for (i = 0; i < n; i++) { // outer loop for indexing first array
            for (j = 0; j < m; j++) { // inner loop for indexing second array
                if (a[i] == b[j]) {
                    System.out.println(a[i] + "");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        common obj = new common();
        obj.acc();
        obj.findCom_dis();
        obj.sc.close();
    }
}
