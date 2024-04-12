/*
 
Consider the following series : 

1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 ......

This series is a mixture of 2 series - all the odd terms in this series form a geometric sereis and all the even terms form yet another geometric series. 

WAP to find the Nth term in the series

 */

public class question2{
    public static void main(String args[]){
        int n = 10 ; 
        getTerm(n);
    }
    public static void getTerm(int n){

        int a = 1, b = 1 ;

        for(int i = 1 ; i <= n ; i ++){

            if (i % 2 != 0){
                if(i == 1){
                    a = 1 ; 
                } else {
                    a = a*2 ; 
                }
            } else {
                if(i == 2){
                    b = 1 ; 
                } else {
                    b = b*3 ; 
                }
            }
        }
        if(n % 2 != 0){
            System.out.println("The " + n + " term of the series is: " + a) ; 
        } else {
            System.out.println("The " + n + " term of the series is: " + b) ; 
        }
    }
}