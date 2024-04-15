
/* 

A washing machine works on the principle of Fuzzy System, the weight of clothes put inside it for washing is uncertain But based on weight measured by sensors, it decides time and water level which can be changed by menus given on the machine control area.  

For low level water, the time estimate is 25 minutes, where approximately weight is between 2000 grams or any nonzero positive number below that.

For medium level water, the time estimate is 35 minutes, where approximately weight is between 2001 grams and 4000 grams.

For high level water, the time estimate is 45 minutes, where approximately weight is above 4000 grams.

Assume the capacity of machine is maximum 7000 grams

Where approximately weight is zero, time estimate is 0 minutes.

Write a function which takes a numeric weight in the range [0,7000] as input and produces estimated time as output is: “OVERLOADED”, and for all other inputs, the output statement is

“INVALID INPUT”.

Input should be in the form of integer value –

Output must have the following format –

Time Estimated: Minutes

Example:
Input value
2000
Output value
Time Estimated: 25 minutes

*/

import java.util.Scanner ; 

public class question9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the numeric weight: ");        
        int weight = sc.nextInt() ; 

        System.out.println(estimateTime(weight)); ; 
    }

    public static int estimateTime(int weight){
        int time = 0 ;

        if(weight < 0 || weight > 7000){
            System.out.println("OVERLOADED! Invalid input");
        } else {
            if(weight > 0 && weight <= 2000){
                time = 25 ; 
            } else if (weight >= 2001 && weight <= 4000){
                time = 35 ; 
            } else {
                time = 45 ; 
            }
        }
        return time ; 
    }
}
