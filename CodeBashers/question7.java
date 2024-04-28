package CodeBashers;

/*

Given array of N integers, task is to replace elements with its rank in the array 

Example1: 

Input - 20  15  26  2  98  6
Output- 4   3   5   1  6   2

Explanation  - When sorted, the array is 2, 6, 15, 20, 26, 98. So that rank of 2 is 1, rank of 6 is 2, rank of 15 is 3 and so on.....

 */

public class question7 {
    public static void main(String[] args) {
        
    int[] arr = {20, 15, 26, 2, 98, 6} ; 

    int min = arr[0] ;
    int count = 1 ;  

    for(int i=0 ; i < arr.length ; i++){

        if(arr[i] < min){
            count++ ; 
            arr[count]
        }
    }
    }
}
