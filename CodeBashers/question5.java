package CodeBashers;

/*

Given an array of integers, find an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. If no such index exists, return -1. 

For example, consider the array {-7, 1, 5, 2, -4, 3, 0}

Index 3 is an equilibrium index because the sum of elements on the left, -7+1+5=1 , is equal to the sum of elements on the right, -4+3+0 = 1 

*/

public class question5 {
    public static void main(String[] args) {
        
        int[] arr = {-7, 1, 5, 2, -4, 3, 0} ; 

    }
    public static int equilibriumIndex(int[] arr){

        int n = arr.length ; 

        // calculate the total sum of the array 

        int totalSum = 0 ; 

        for(int num: arr){
            totalSum += num ; 
        }

        // initialize the left sum to 0 

        int leftSum = 0 ; 

    }
}
