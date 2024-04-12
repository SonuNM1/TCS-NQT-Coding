
/*
 
SUPERMARKET PRICE 


A supermarket maintains a pricing format for all its products. A value N is printed on each product. When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. The task here is to design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed (price) . 


input : 5244
output : 160 

From the input above -> Product of the digits 5,2,4,4 -> 5*2*4*4 = 160

*/


public class question3 {
    public static void main(String args[]){

        int input = 5244 ; 
        int result = 1 ; 

        while(input != 0){
            int digit = input % 10 ; // 4
            result *= digit ; 
            input = input / 10 ; 
        }
        System.out.println(result) ; 
    }
}    

