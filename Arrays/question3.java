
/* second smallest and second largest element in the array  */

import java.util.* ; 

public class question3 {
    public static void main(String[] args) {

        int[] arr = {2,1,5,3} ;

        int[] result = secondLargestSmallest(arr) ; 

        System.out.println("Second smallest: " + result[0]);
        System.out.println("Second largest: " + result[1]);

    }

    public static int[] secondLargestSmallest(int[] arr){

        Arrays.sort(arr) ; 

        int[] result = new int[2] ; 

        result[0] = arr[1] ; // second smallest 
        result[1] = arr[arr.length-1] ; // second largest 

        return result ; 
    }
}
