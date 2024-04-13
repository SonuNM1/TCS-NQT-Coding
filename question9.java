
/* 

Given a string str, contains digits only. The task is to find the remainder of str when n is divided by k

Constraints:

Size of str >= 10 <= 100
1 <= k < 20

Input: 
2345434534665
6

Output: 3

Input: 
23454345346653434454543
3

Output: 0

*/

public class question9 {
    public static void main(String args[]){

        String str1 = "2345434534665" ; 
        int k1 = 6 ; 
        System.out.println(findRemainder(str1, k1)); 

        String str2 = "23454345346653434454543" ; 
        int k2 = 3 ; 
        System.out.println(findRemainder(str2, k2)); 

    }
    public static int findRemainder(String str, int k){

      int remainder = 0 ; 

      for(int i=0 ; i < str.length() ; i++){

        remainder = (remainder*10 + (str.charAt(i)-'0')) % k ; 

      }

      return remainder ; 

    }
}
