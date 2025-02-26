package com.java.binarySearch;

public class lowerBound {
    public static int lowerbound(int[] arr,int x){
        int n = arr.length;
        int low = 0;
        int high = arr.length - 1;
        int ans = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println("The lower bound is the index : " + lowerbound(arr,3));
    }
}
