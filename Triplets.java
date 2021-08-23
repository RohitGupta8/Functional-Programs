package com.first;

import java.util.Arrays;
import java.util.Scanner;

// A simple Java program to find three elements
// whose sum is equal to zero
class Triplets {
    // Prints all triplets in arr[] with 0 sum
    static void findTriplets(int[] arr, int n) {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (!found)
            System.out.println(" not exist ");

    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[9];
        System.out.print("enter value for element insert");
        int a = sc.nextInt();

        for (int l = 0; l < a; l++) {
            arr[l] = sc.nextInt();
        }
        System.out.println("Given array is: " + Arrays.toString(arr));
        int n = arr.length;
        findTriplets(arr, n);

    }
}
//This code is contributed by
//Smitha Dinesh Semwal
