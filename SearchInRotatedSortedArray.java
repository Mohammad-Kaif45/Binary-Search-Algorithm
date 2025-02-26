package com.java.binarySearch;

public class SearchInRotatedSortedArray {
    public static int search(int[] arr,int target){
        int low = 0;
        int high = arr.length - 1;
        while(low  <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }

            //left half sorted -->
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // right half sorted -->
                if(arr[mid] <= target && target < arr[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int ans = search(arr,1);
        if(ans == -1){
            System.out.println("Target is not possible");
        } else {
            System.out.println("Element found at : " + ans);
        }
    }
}
