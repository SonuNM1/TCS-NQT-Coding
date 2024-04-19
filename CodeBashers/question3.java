package CodeBashers;

/*

Given an array of integers, find the nearest smaller number for every element such that the smaller element is on the left side. 

Input: {1, 6, 4, 10, 2, 5}
Output: {-1, 1, 1, 4, 1, 2}

Input: {3, 2, 1}
Output: {-1, -1, -1}

 */

import java.util.Scanner ; 
import java.util.Stack ; 

public class question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the length of array: ");
        
       int n = sc.nextInt() ; // length of input array 
       
       int[] inputArr = new int[n] ; 
       int[] outputArr = new int[n] ; 

       // taking input for array elements

        System.out.println("Enter the array elements: ");

        for(int i=0 ; i < inputArr.length ; i++){
            inputArr[i] = sc.nextInt() ; 
        }

        Stack<Integer> stack = new Stack<>() ; 

        // iterate through the array from left to right 

        for(int i=0 ; i < inputArr.length ; i++){

            while(!stack.isEmpty() && stack.peek() >= inputArr[i]){
                stack.pop() ; 
            }

            if(stack.isEmpty()){
                outputArr[i] = -1 ; 
            } else {
                outputArr[i] = stack.peek() ; 
            }

            // push the current element to the stack 

            stack.push(inputArr[i]) ; 

        }

    }
}
