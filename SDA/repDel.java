package SDA;

import java.util.*;

public class repDel {
    Scanner sc = new Scanner(System.in);
    int arr[];
    int n;
    int i, j;

    void acc() {
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void rep() {
        Arrays.sort(arr); // sort the array before finding deleting repeating elements
        j = 0; // set pointer to find unique elements to 0

        for (int i = 1; i < n; i++) { // start from 1
            if (arr[i] != arr[j]) { // check if the element at 0 and 1 are equal, if not then we've found unique
                                    // element
                j++; // move forward the pointer
                arr[j] = arr[i]; // move the unique element forward
            }
        }
        arr = Arrays.copyOf(arr, j + 1); // store the array of unique elements back into the original var with the
                                         // length of j+1
    }

    void dis() {
        System.out.println("After removing duplicate elements:");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        repDel obj = new repDel();
        obj.acc();
        obj.rep();
        obj.dis();
        obj.sc.close();
    }
}
