package com.java.binarySearch;

public class FindElement {

    // Interactive approach
    public static int find(int[] arr,int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Recursive approach
    public static int recursive(int[] arr,int low,int high,int target){
        if(low > high){
            return -1;
        }
        int mid = low + (high - low) / 2;
        if(arr[mid] == target){
            return mid;
        } else if(arr[mid] < target){
            return recursive(arr,mid + 1,high,target);
        } else {
            return recursive(arr,low,mid - 1,target);
        }

    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,12,16,17};
        System.out.println("Element fount at index : " + find(arr,9));
        System.out.println("Element found at index : " + recursive(arr,0,arr.length - 1,16));
    }
}
