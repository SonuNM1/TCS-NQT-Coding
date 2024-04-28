// package CodeBashers;

/*

a chocolate factory is packing chocolates into packets. The chocolate packets here represent an array of N number of integer values. The task is to find the empty packets (0) of chocolate and push it to the end of conveyer belt. 

Example1 : 
N = 8 
arr = [4, 5, 0, 1, 9, 0, 5, 0]

output: 4 5 1 9 5 0 0 

 */

public class question6 {
    public static void main(String args[]){
        int[] arr = {4, 5, 0, 1, 9, 0, 5, 0} ; 

        int temp = 0 ; 

        for(int i=0 ; i <= arr.length-2 ; i++){

            if(arr[i] == 0){
                temp = arr[i] ; 
                arr[i] = arr[i+1] ; 
                arr[i+1] = temp ; 
            }
        }
        for(int element: arr){
            System.out.println(element);
        }
    }
}
