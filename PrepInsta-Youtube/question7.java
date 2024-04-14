
/* 

Consider the below series: 

0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8 

*/



public class question7{
    public static void main(String args[]){
        int n = 10 ; 
        result(n);
    }
    public static void result(int n){

        int a = 0 , b = 0 ; 

        for(int i=1; i <= n ; i++){
            if( i%2 != 0){
                if(i == 1){
                    a = 0 ; 
                } else {
                    a = a + 2 ; 
                }
            } else {
                if( i == 2){
                    b = 0 ; 
                } else {
                    b = b + 1 ; 
                }
            }
        }
        if(n%2 == 0){
            System.out.println("The "+n+ " term will be: " + b);
        } else {
            System.out.println("The "+ n+ " term will be: " + a) ; 
        }
    }
}