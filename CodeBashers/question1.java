package CodeBashers;

/* 

Consider the following series: 1, 1, 2, 3, 4, 7, 8, 15, 9, 24, 16, 40, 32, 72, 104, 27 ......

This series is the mixture of 3 series: 

- All the prime position values are power of 2
- All the perfect square psoition are power of 3
- Remaining positions are sum of previous 2 values 

For example, if N=15, the 15th term in the series is 104, so only value 104 should be printed to STDOUT 

You can assume that N will not exceed 40

*/

public class question1 {
    public static void main(String[] args) {
        
        int n = 15 ; 

        int powerOfTwo = 1 ; 
        int powerOfThree = 1 ; 

        int[] arr = new int[40] ; 

        for(int i=0 ; i < n ; i++){
            if(isPrime(i+1)){
                arr[i] = powerOfTwo ; 
                powerOfTwo *= 2 ; 
            } else if(isPerfectSquare(i+1)){
                arr[i] = powerOfThree ; 
                powerOfThree *= 3 ; 
            } else {
                arr[i] = arr[i-1] + arr[i-2] ; 
            }
        }
    }
    public static boolean isPrime(int n){
        
        int count = 0 ; 

        if(n <= 1){
            return false ; // 1 and any negative number is not prime
        }

        if(n == 2){
            return true ; // 2 is prime 
        } 
        for(int i=2 ; i <= n/2 ; i++){
            if (n % i == 0){
                return false ;  
            } 
        }
        return true ; 
    }

    public static boolean isPerfectSquare(int n){
        if(n == 1 || n == 0){
            return true ; 
        }
        
        int sqrt = (int) Math.sqrt(n) ; 

        if(sqrt*sqrt == n){
            return true ; 
        } else {
            return false ; 
        }
    }
}
