
/* 

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner ; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		
		int[][] oxygenLevels = new int[3][3] ; 
		
		// input oxygen levels 
		
		System.out.println("Enter oxygen levels for 3 rounds for each trainee: ") ; 
		
		for(int i=0 ; i < 3 ; i++){
		    for(int j=0 ; j < 3 ; j++){
		        int oxygen = sc.nextInt() ; 
		        if(oxygen < 1 || oxygen > 100){
		            System.out.println("INVALID INPUT") ; 
		            return ; 
		        }
		        oxygenLevels[i][j] = oxygen ; 
		    }
		}
		
		// calculate average oxygen levels and find the max 
		
		int maxAverage = 0 ; 
		
		for(int i=0 ; i < 3 ; i++){
		    int sum = 0 ; 
		    for(int j=0 ; j < 3 ; j++){
		        sum += oxygenLevels[j][i] ;  
		    }
		    int average = Math.round((float)sum/3) ; 
		    
		    if(average > maxAverage){
		        maxAverage = average ; 
		    }
		}
		
		// output most fit trainee 
		
		boolean unfit = true ; 
		
		for(int i=0 ; i < 3; i++){
		    int sum = 0 ; 
		    for(int j=0 ; j < 3; j++){
		        sum += oxygenLevels[j][i] ; 
		    }
		    int average = Math.round((float)sum/3) ; 
		    
		    if(average == maxAverage){
		        System.out.println("Trainee number: " + (i+1));
		        unfit = false ; 
		    }
		}
		if(unfit){
		    System.out.println("All trainee are unfit");
		}
	}
}


*/
public class question8{
    public static void main(String[] args) {
        
    }
}