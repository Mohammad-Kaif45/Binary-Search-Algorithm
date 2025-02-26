package com.java.binarySearch;

public class MinimumInRotatedSortedArray {
    public static int minimum(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int minValue = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[mid]){
                minValue = Math.min(arr[low],minValue);
                low = mid + 1;
            } else {
                minValue = Math.min(arr[mid],minValue);
                high = mid - 1;
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println("The minimum element is : " + minimum(arr));
    }
}
