package CodeBashers;

import java.util.Arrays;

/*

Given an array of integers, find the nearest smaller number for every element such that the smaller element is on the left side. 

Input: {1, 6, 4, 10, 2, 5}
Output: {-1, 1, 1, 4, 1, 2}

Input: {3, 2, 1}
Output: {-1, -1, -1}

 */

public class question4 {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 6, 4, 10, 2, 5} ; 
        int[] arr2 = {3, 2, 1} ; 

        int[] output1 = findNearestSmaller(arr1) ; 
        int[] output2 = findNearestSmaller(arr2) ;
        
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + Arrays.toString(output1));
        
        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.println("Output: " + Arrays.toString(output2));
    }

    public static int[] findNearestSmaller(int[] arr){

        int[] result = new int[arr.length] ; 

        // traverse the array from left to right 

        for(int i=0 ; i < arr.length ; i++){
            int smaller = -1 ; // initialize nearest smaller to -1 

            // check for nearest smaller element to the left 

            for(int j = i-1 ; j>=0 ; j--){
                
                if(arr[j] < arr[i]){
                    smaller = arr[j] ; 
                    break ; 
                }
            }
            result[i] = smaller ; 
        }
        return result ; 
    }
}
