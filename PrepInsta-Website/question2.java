// package PrepInsta-Website;

/* 

Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. 

The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.

Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0


Example 1:

Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal

*/


public class question2 {
    public static void main(String[] args) {        
        String s = "**###" ; 
        System.out.println(result(s)); ; 
    }

    public static int result(String s){
        char[] ch = s.toCharArray() ; 
        int starCount = 0, hashCount = 0 ; 

        for(int i=0 ; i < ch.length ; i++){
            if(ch[i] == '*'){
                starCount++ ; 
            } else {
                hashCount++ ; 
            }
        }
        if(starCount > hashCount){
            return starCount-hashCount ; 
        } else if (starCount < hashCount){
            return starCount-hashCount ; 
        } else{
            return 0;
        }
    }
}
