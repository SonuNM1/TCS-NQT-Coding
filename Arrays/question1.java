// package Arrays;

public class question1 {
    public static void main(String args[]){

        // smallest element in the array 

        int[] arr = {2,1,5,3} ; 

        int smallest = arr[0] ; 

        for(int i=0 ; i < arr.length ; i++){

            if(arr[i] < smallest){
                smallest = arr[i] ; 
            }
        }
        System.out.println(smallest);
    }
}
