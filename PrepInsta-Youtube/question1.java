/* Amarasimha wanted to know the final position of a person, who starts from the origin 0 0 and travels per following scheme:


He first turns and travels 10 units of distance 

His second turn is upward for 20 units 

Third turn is to the left for 30 units 

Fourth turn is the downward for 40 units 

Fifth turn is to the right (again) for 50 units 

.... And thus he travels, every time increasin the travel distance by 10 units. 



 */

public class question1 {
    public static void main(String args[]) {
        int a = 4 ; 
        getDistance(a);
    }

    public static void getDistance(int a) {
        int distance = 10;
        int x = 0;
        int y = 0;
        char ch = 'R';

        while (a > 0) {
            switch (ch) {
                case 'R':
                    x = x + distance; // 10
                    ch = 'U';
                    distance = distance + 10; // 20
                    break;
                case 'U':
                    y = y + distance ; // 20
                    ch = 'L' ;
                    distance = distance + 10 ; // 30 
                    break ;
                case 'L':
                    x = x - distance ; // -20
                    ch = 'D' ; 
                    distance = distance + 10 ; // 40
                    break ;
                case 'D':
                    y = y - distance ; // -20 
                    ch = 'A';
                    distance = distance + 10 ; // 50
                    break ;
                case 'A' :
                    x = x + distance ; // 30
                    ch = 'R';
                    distance = distance + 10 ; 
                    break ;     
            }
            a -- ; 
        }
        System.out.println(x + " " + y) ; 
    }
}