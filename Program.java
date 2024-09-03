//import stuff here

//Your code here
//import stuff here
import java.util.Scanner;
//Your code here
public class Program7{
    public static void main(String[] args){
        int stanleyNickle = 0;
        int klevin = 0;
        int schruteBucks = 0;
        
        Scanner numScanner = new Scanner(System.in);
        
        System.out.println("Enter value for SchruteBuck: ");
        schruteBucks = numScanner.nextInt();
        
        System.out.println("Enter value for Klevin: ");
        klevin = numScanner.nextInt();
        
        System.out.println("Enter value for StanleyNickles: ");
        stanleyNickle = numScanner.nextInt();
        
        int schruteBuck2 = 100 * stanleyNickle;
        
        final int ktoSB = 20;
        final int sntoK = 12;
        
        int totalSchruteBucks = 20*klevin;
        int totalKlevins = 12*stanleyNickle;
        
        double convTotal = 0;
        convTotal = (klevin * sntoK) + stanleyNickle;
        
        double convTotal2 = convTotal / (ktoSB * sntoK);
        double convTotal3 = (schruteBucks + convTotal2);

        System.out.printf("Value is: %.2f",convTotal3);
        
        
        
    }
}
//Paste console output below:
/*
Enter value for SchruteBuck: 
5
Enter value for Klevin: 
2
Enter value for StanleyNickles: 
8
Value is: 5.13

*/

//Paste console output below:
/*


*/
