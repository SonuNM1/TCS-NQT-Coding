package CodeBashers;

/* 

The Caesar is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet. 

For example, with a shift of 1, P would be replaced by Q, Q would become R, and so on. 

To pass an encrypted message from one person to another, it is first necessary that both parties have the 'Key' for the cipher, so that the sender may encrypt and receiver may decrypt it. 

Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 characters in the alphabet. 

As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places. 

For example, if a given plain text contains any digit with values 5 and key = 2 , then 5 will be replaced by 7 


Input 1: AdfTu34 
Key = 1 

Output = BegUv45


*/

import java.util.Scanner ; 

public class question2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the String ");
        String str = sc.nextLine() ; 

        System.out.println("Original String: " + str) ; 

        System.out.println("Enter the key: ");
        int key = sc.nextInt() ; 

        customCipher(str, key);

    }

    public static void customCipher(String str, int key){

        String encrypted = " " ; 

        char[] characterStr = str.toCharArray() ;

        for(int i=0 ; i < str.length() ; i++){

            char a = characterStr[i] ; 

            if(Character.isLetter(a)){ // checks if character is alphabet 
                if(Character.isUpperCase(a)){
                    char encryptedChar = (char)(('A' + (a - 'A')+key)%26) ; 
                    encrypted += encryptedChar ; 
                } else {
                    char encryptedChar = (char)(('a' + (a-'a')+key)%26) ; 
                }
            } else { // if character is digit 
                
            }
        }
    }
}
