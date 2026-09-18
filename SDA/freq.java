package SDA;

import java.util.*;

public class freq {
    Scanner sc = new Scanner(System.in);
    int n, b, i;
    int k = 0;
    int c = 0;
    int a[];

    void acc() {
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter a number to find its frequency:");
        b = sc.nextInt();
    }

    void findFreq() {

        // first check if the target element in present in the array, and proceed only
        // if its present
        for (i = 0; i < n; i++) {
            k = 0; // set indicator at 0
            if (a[i] == b) {
                k = 1; // indicator = 1 when number found
                break;
            }
        }
        if (k == 1) {
            for (int j = 0; j < a.length; j++) {
                if (b == a[j]) {
                    c++; // if an element in the array equals to the target, then increase counter
                }
            }
            System.out.println(b + " is present " + c + " times in the array");
        } else {
            System.out.println("Number is not present");
        }
    }

    public static void main(String[] args) {
        freq obj = new freq();
        obj.acc();
        obj.findFreq();
        obj.sc.close();
    }
}
