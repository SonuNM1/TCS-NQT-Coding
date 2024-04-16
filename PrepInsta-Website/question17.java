
/* 

A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different groups of patients depending on their age. If the patient’s age is below 17, fees is 200 INR. If the patient’s age is between 17 and 40, fees is 400 INR. If patient’s age is above 40, fees is 300 INR. Write a code to calculate earnings in a day for which one array/List of values representing age of patients visited on that day is passed as input.
Note:

Age should not be zero or less than zero or above 120
Doctor consults a maximum of 20 patients a day
Enter age value (press Enter without a value to stop):
Example 1:
Input
20
30
40
50
2
3
14
Output
Total Income 2000 INR
Note: Input and Output Format should be same as given in the above example.
For any wrong input display INVALID INPUT
Output Format
Total Income 2100 INR

*/

import java.util.Scanner ; 
public class question17 {
    public static void main(String[] args) {
        
        int earning = 0 ; 
        int max = 20 ; 
        int[] patientAge = new int[max] ; 

        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the patient's age: ");

        for(int i=0 ; i < patientAge.length ; i++){
            patientAge[i] = sc.nextInt() ; 

            if(patientAge[i] < 0 || patientAge[i] != 0 || patientAge[i] > 120){
                System.out.println("INVALID INPUT");
            }
            else if(patientAge[i] < 17){
                earning += 200 ; 
            } else if(patientAge[i] >= 17 && patientAge[i] < 40){
                earning += 400 ; 
            } else {
                earning += 300 ; 
            }
        }

        System.out.println("Total earning for the day: " + earning + " INR");

    }
}
