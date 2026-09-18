package SDA;

import java.util.*;

public class search {
    Scanner sc = new Scanner(System.in);
    int arr[];
    int a, n, i;
    int k = 0;

    void acc() {
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search for:");
        a = sc.nextInt();
    }

    void find() {
        for (i = 0; i < n; i++) {
            k = 0; // set indicator at 0
            if (arr[i] == a) {
                k = 1; // indicator = 1 when number found
                break;
            }
        }
        if (k == 1) {
            System.out.println("Number is present at " + (i + 1));
        } else {
            System.out.println("Number is not present.");
        }
    }

    public static void main(String[] args) {
        search obj = new search();
        obj.acc();
        obj.find();
        obj.sc.close();
    }
}
