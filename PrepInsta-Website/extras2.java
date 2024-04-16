
/*

Find the 15th term of the series?
0,0,7,6,14,12,21,18, 28

 */

import java.util.Scanner ; 

public class extras2 {
    public static void main(String[] args) {
        
        int a = 0 , b = 0 ; 

        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the term for which you want to calculate the value in the series");
        int term = sc.nextInt() ; 

        for(int i=1 ; i <= term ; i++){

            if(i % 2 != 0){
                if(i == 1){
                    b = 0 ; 
                } else {
                    b += 7 ; 
                }
            } else {
                if(i == 2){
                    a = 0 ; 
                } else {
                    a += 6 ; 
                }
            }
        }
        if(term % 2 != 0){
            System.out.println("Term: " + b);
        } else {
            System.out.println("Term: " + a);
        }
    }   
}
