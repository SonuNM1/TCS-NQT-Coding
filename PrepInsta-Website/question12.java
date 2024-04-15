
/* 

We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior Wall in units of square feet
4. Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR

*/

import java.util.Scanner ; 

public class question12{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the number of interior walls: ");
        int noOfInteriorWalls = sc.nextInt() ; 

        System.out.println("Enter the number of exterior walls: ");
        int noOfExteriorWall = sc.nextInt() ; 

        float sumInteriorSurface = 0 , sumExteriorSurface = 0 ; 

        if(noOfInteriorWalls == 0){
            return ; 
        } else {
            System.out.println("Enter the surface area values of each interior walls: ");

            for(int i=0 ; i <= noOfInteriorWalls ; i++){
                float saInterior = sc.nextInt() ; 
                sumInteriorSurface += saInterior ;  
            }
        }

        if(noOfExteriorWall == 0){
            return ; 
        } else {
            System.out.println("Enter the surface area values of each exterior walls: ");

            for(int i=0 ; i < noOfExteriorWall ; i++){
                float saExterior = sc.nextInt() ; 
                sumExteriorSurface += saExterior ; 
            }
        }

        System.out.println("Total Estimated Cost: " + ((sumExteriorSurface*12) + (sumInteriorSurface*18)));
    }
}