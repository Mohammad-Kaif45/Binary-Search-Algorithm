package com.java.binarySearch;

public class SearchInRotatedSortedArrayII {
    public static boolean search(int[] arr,int k){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == k){
                return true;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low + 1;
                high = high - 1;
                continue;
            }

            //if left half is sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= k && k <= arr[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // if right half is sorted
                if(arr[mid] <= k && k <= arr[high]){
                    low = mid + 1;
                } else {
                    high = mid  -1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,3,3,3,3};
        int k = 3;
        boolean ans = search(arr,k);
        if(ans == false){
            System.out.println("target is not present");
        } else {
            System.out.println("Target is present");
        }
    }
}
