/* 

An English school teacher is teaching how to build sentences for kindergarten students. She starts by teaching two words in a sentence, then 3 words and so on. The next step is that she asks the students to find which word in the sentence they have made has the maximum number of alphabets. The task here is to write program to find the longest word in each input sentence (str). The sentence can consist of uppercase, lowercase alphabets, special characters and numbers. 

Input: Knowledge is the greatest git 
Output: 9 ('Knowledge' word has highest number of alphabets or characters)

Input: 11223##%%5566778899 Saturn V rocket's first stage carries 203,400 gallons (770,000 litres) of kerosene fuel

Output: 19 ('11223##%%5566778899')


Constraints: str = A-Z,a-z,0-9, special characters


*/


public class question8{
    public static void main(String args[]){

        String sentence = "Elephant in the room" ; 

        String [] arr = sentence.split(" ") ; 

        int max = 0 ; 

        for(int i=0 ; i < arr.length ; i++){

            max = Math.max(max, arr[i].length()) ; 

        }

        System.out.println(max);

    }
}
