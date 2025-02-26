package com.java.binarySearch;

public class Occurence {
    public static int first(int[] arr,int n,int k){
        int low = 0;
        int high = n - 1;
        int first = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == k){
                first = mid;
                high = mid - 1;
                // low = mid + 1 -> for last occurance
            } else if(arr[mid] < k){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,13,13,13,20,40};
        int n = arr.length;
        System.out.println("First occurance of given number is : " + first(arr,n,13));
    }
}
