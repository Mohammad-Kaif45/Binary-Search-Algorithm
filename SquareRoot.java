package com.java.binarySearch;

public class SquareRoot {
    public static int find(int n){
        int low = 1;
        int high = n;
        int ans = 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mid * mid <= n){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int n = 28;
        System.out.println("Square root a of : " + n + " is " + find(n));
    }
}
