// package Arrays;

/* Largest element in the array */

public class question2 {
    public static void main(String[] args) {
        
        int[] arr = {2,1,5,3} ;
        int largest = arr[0] ; 

        for(int i=0 ; i < arr.length ; i++){
            if(largest < arr[i]){
                largest = arr[i] ; 
            }
        }
        System.out.println(largest);
    }
}
