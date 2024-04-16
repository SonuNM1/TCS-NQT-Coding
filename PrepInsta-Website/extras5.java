
/*

The program will recieve 3 English words inputs from STDIN

These three words will be read one at a time, in three separate line

The first word should be changed like all vowels should be replaced by %
The second word should be changed like all consonants should be replaced by #
The third word should be changed like all char should be converted to upper case

Then concatenate the three words and print them

Other than these concatenated word, no other characters/string should or message should be written to STDOUT

For example if you print how are you then output should be h%wa#eYOU.

You can assume that input of each word will not exceed more than 5 chars 

 */

import java.util.Scanner ; 

public class extras5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter first word: ");
        String firstWord = sc.nextLine().toLowerCase() ; 

        System.out.println("Enter second word: ");
        String secondWord = sc.nextLine().toLowerCase() ; 

        System.out.println("Enter third word: ");
        String thirdWord = sc.nextLine() ; 

        thirdWord = thirdWord.toUpperCase() ; 

        String vowels = replaceVowels(firstWord) ; 
        String consonants = replaceConsonants(secondWord) ; 

        String concatenatedResult = vowels + consonants + thirdWord ; 
        System.out.println(concatenatedResult);
    }
    public static String replaceConsonants(String str){
        str = str.replaceAll("[bcdfghjklmnpqrstvwxyz]", "#") ; 
        return str ; 
    }
    public static String replaceVowels(String str){
        str = str.replaceAll("[aeiou]", "%") ; 
        return str ; 
    }
}
