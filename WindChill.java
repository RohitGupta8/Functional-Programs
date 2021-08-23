package com.first;

import java.util.*;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Wind Chill Computation ======");
        System.out.print("Enter Temperature in Fahrenheit: ");
        double t = sc.nextDouble(); // temperature
        System.out.print("Enter Wind Speed in mph: ");
        double v = sc.nextDouble(); // wind speed (mph)
        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Given temperature of " + t + " Fahrenheit" + " and a wind speed of " + v + " mph");
        System.out.printf("The windchill is = %.4f " , windChill);
    }
}
