
/*

Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …

This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet another geometric series. Write a program to find the Nth term in the series.

The value N in a positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than value of n th term,no other character / string or message should be written to STDOUT. For example , if N=16, the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.

You can assume that N will not exceed 30. 

 */

import java.util.Scanner ; 

public class extras3 {
    public static void main(String args[]){

        int odd = 0 , even = 0 ; 

        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the nth term: ");
        int n = sc.nextInt() ; 

        for(int i=1 ; i <= n ; i++){
            if(i % 2 != 0){
                if(i == 1){
                    odd = 1 ; 
                } else {
                    odd = odd*2 ; 
                }
            } else {
                if(i == 2){
                    even = 1 ; 
                } else {
                    even = even*3 ; 
                }
            }
        }

        if(n % 2 != 0){
            System.out.println(odd);
        } else {
            System.out.println(even);
        }

    }
}
