

/* 

The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet.
For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.
To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher, so that the sender may encrypt and the receiver may decrypt it.
Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.
As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places.
For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be replaced by 7, “-”(minus sign) will remain as it is. Key value less than 0 should result into “INVALID INPUT”

Example 1:
Enter your PlainText: All the best
Enter the Key: 1

The encrypted Text is: Bmm uif Cftu

Write a function CustomCaesarCipher(int key, String message) which will accept plaintext and key as input param

 */

import java.util.Scanner ; 

public class question11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter your PlainText: ");
        String message = sc.nextLine() ; 

        System.out.println("Enter the key for shifting: ");
        int key = sc.nextInt(); 

        CustomCaesar(key, message);
    }

    public static void CustomCaesar(int key, String message){

        if(key < 1){
            System.out.println("INVALID INPUT");
            return ; 
        
        StringBuilder encryptedMessage = new StringBuilder() ; 

        for(int i= 0 ; i < message.length() ; i++){
            char ch = message.charAt(i) ; 

            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    char encryptedChar = (char)(('A' + (ch-'A') + key) % 26) ; 
                    encryptedMessage.append(encryptedChar) ; 
                }
                else {
                    char encryptedChar = (char)(('a' + (ch-'a') + key) % 26) ; 
                    encryptedMessage.append(encryptedChar) ; 
                }
            }
            else if(Character.isDigit(ch)){
                char encryptedChar = (char)(('0' + (ch-'0')+key) % 10 ) ; 
                encryptedMessage.append(encryptedChar) ; 
            }
            else {
                encryptedMessage.append(ch) ; 
            }
        }
        System.out.println("The encrypted text is: " + encryptedMessage.toString());
    }   
}

