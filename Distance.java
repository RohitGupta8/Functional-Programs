package com.first;

import java.util.*;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COMPUTE DISTANCE FROM ORIGIN");
        System.out.println("ENTER COORDINATES  X & Y");
        // input point coordinates
        int x = sc.nextInt();
        int y = sc.nextInt();


        // compute distance
        //double distance = Math.sqrt((x * x) + (y * y));
        double distance = Math.sqrt(
                Math.pow(x, 2) + Math.pow(y, 2));


        // output distance
        System.out.println("Distance from (0, 0) to (" +
                x + ", " + y + ") is " +
                distance);

    }
}