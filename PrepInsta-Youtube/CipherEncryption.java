
/*

A high-profile secret agency wants to handle all the messages sent and received in ciphers. They need to build a program/software where every mail sent or received in the organization will be encrypted using some secrete coders. One of format used can be as follows: 


Actual : a b c d e f g h i j k l m n o p q r s t u v w x y z

Cipher : f g h i j k l m n o p q r s t u v w x y z a b c d e

The task is to encrypt the given string (str1) as per the ciphers given in the format above. Note: String cannot have any special characters, space, number or any uppercase letter. 


Input: Word 
Output: btwi 

 */


public class CipherEncryption{
    public static void main(String args[]){

        String input = "word" ; 

        encrypt(input) ; 
    }

    public static String encrypt(String str){
        String encrypted = "" ; 

        for(int i = 0 ; i < str.length() ; i++){

            char ch = str.charAt(i) ; 

            if(ch >= 'a' && ch <= 'z'){

                char encryptedChar = (char)('a' + (ch - 'a' + 5) % 26 ) ;
                
                encrypted += encryptedChar ; 

            } else {
                encrypted += ch ; 
            }
        }
        return encrypted ; 
    }
}
