// package TCS-NQT PYQ-Coding;

/*

Factorial of a number without using multiplication or divisor operator 

 */

public class question1 {
    public static void main(String args[]){

        int number = 5 ; 
        int result = factorial(number) ; 

        System.out.println(result);

    }
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1 ; 
        }
        int result = 1 ;     

        for(int i=n ; i >= 1; i--){ // i = 5 
            result *= i ; 
        }

        return result ; 
    }
}
