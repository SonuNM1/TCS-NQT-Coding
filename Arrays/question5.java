
/* Reverse a given array */

public class question5 {
    public static void main(String[] args) {
        
        int[] num = {5, 2, 9, 1, 7};

        int length = num.length ; 

        int[] reverseArray = new int[length] ; 

        for(int i=length-1 ; i >= 0; i--){
            reverseArray[i] = num[i] ; 
        }

        for(int elements: reverseArray){
            System.out.print(elements + " ");
        }

    }
}
