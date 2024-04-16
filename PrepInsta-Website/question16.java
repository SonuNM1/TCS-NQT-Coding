
/* 

FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button. A vending machine can serve range of products as follows:

Coffee

1. Espresso Coffee
2. Cappuccino Coffee
3. Latte Coffee

Tea

1.Plain Tea
2.Assam Tea
3. Ginger Tea
4. Cardamom Tea
5. Masala Tea
6. Lemon Tea
7. Green Tea
8. Organic Darjeeling Tea

Soups 

1. Hot and Sour Soup
2. Veg Corn Soup
3. Tomato Soup
4. Spicy Tomato Soup

Beverages

1. Hot Chocolate Drink
2. Badam Drink
3. Badam-Pista Drink

Write a program to take input for main menu & sub menu and display the name of sub menu selected in the following format (enter the first letter to select main menu):

Welcome to CCD 
Enjoy your
Example 1:

Input:
c
1
Output
Welcome to CCD!
Enjoy your Espresso Coffee!

Example 2:
Input:
t
9
Output
INVALID OUTPUT!

*/

import java.util.Scanner ; 

public class question16 {
    public static void main(String args[]){
        
        String[] c = {"Espresso", "Cappuccino", "Latte"} ; 

        String[] t = {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamon Tea", "Masala Tea", "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"} ; 

        String[] s = {"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"} ; 

        String[] b = {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"} ; 

        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter your main-menu choice: ");
        char menu = sc.next().charAt(0) ; 

        menu = Character.toLowerCase(menu) ; 

        System.out.println("Enter your sub-menu choice: ");
        int subMenu = sc.nextInt() ; 

        boolean validSubMenu = false ; 

        switch (menu) {
            case 'c':
                if(subMenu >= 1 && subMenu <= c.length){
                    validSubMenu = true ; 
                    System.out.println("Welcome to  CCD");
                    System.out.println("Enjoy your " + c[subMenu-1]);
                }
                break;
            case 't':
                if (subMenu >= 1 && subMenu <= t.length) {
                    validSubMenu = true ; 
                    System.out.println("Welcome to CCD");
                    System.out.println("Enjoy your " + t[subMenu-1]);
                }
                break ; 
            default:
                System.out.println("INVALID INPUT");
        }

        if(!validSubMenu){
            System.out.println("INVALID INPUT");
        }
       
    }
}
