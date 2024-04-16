
/*

Chain Marketing Organization has has a scheme for income generation, through which its members generate income for themselves. The scheme is such that suppose A joins the scheme and makes R and V to join this scheme  then A is Parent Member of R and V who are child Members. When any member joins the scheme then the parent gets total commission of 10% from each of its child members.
Child members receive commission of 5% respectively. If a Parent member does not have any member joined under him, then he gets commission of 5%.
Take name of the members joining the scheme as input.
Display how many members joined the scheme including parent member.Calculate the Total commission gained by each members in the scheme. The fixed amount for joining the scheme is Rs.5000 on which commission will be generated
SchemeAmount = 5000

Example 1: When there are more than one child members 
Input : (Do not give input prompts.Accept values as follows. )
Amit                     //Enter parent Member as this
Y                           //Enter Y if  Parent member has child members otherwise enter N
Rajesh,Virat        //Enter names of child members of Amit in comma separated
Output:(Final Output must be in format given below.)
TOTAL MEMBERS:3
COMISSION DETAILS
Amit: 1000 INR
Rajesh :250 INR
Virat: 250 INR

Example 2: When there is only one child member in the hierarchy
Input :
Amit
Y
Rajesh
Output:
Total Members: 2 
Comission Details
Amit: 500 INR
Rajesh: 250 INR

 */

import java.util.Scanner;

public class question15 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter parent member: ");
        String parent = sc.nextLine() ; 

        System.out.println("Does the parent has child members: ");
        char hasChild = sc.next().charAt(0) ; 
        sc.nextLine() ; // consume newline character 

        double parentCommission = 0 ; 
        int totalMember = 1 ; // since the parent member has to be included as well 

        if(hasChild == 'Y' || hasChild == 'y'){
            System.out.println("Enter child members of parent " + parent + " in comma-separated format");
            String childMembersInput = sc.nextLine() ; 

            String[] childMembers = childMembersInput.split(",") ; 

            parentCommission = (0.1*5000)*(childMembers.length) ; 

            System.out.println("COMMISSION DETAILS: ");

            for(String child: childMembers){
                double childCommission = 0.05 * 5000 ; 

                System.out.println(child.trim() + ": " + childCommission + " INR");
                totalMember++ ; 
            }
        } else {
            parentCommission = 0.05*5000 ; 
        }
        System.out.println("Total members: " + totalMember);
        System.out.println(parent + " :" + parentCommission + " INR");
        sc.close() ; 
    }
}
