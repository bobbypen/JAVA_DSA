package assignment_2;
import java.util.Scanner;
public class Q_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int min = 0;
        int max = 100;
        int steps = 20;
        int c = 0;
        int i = 0;
        while(i<=max){
             c =  (min - 32)*5/9;
             
              System.out.print(min + "\t" + c);
             System.out.println();
             
             min = min + 20;
             
            
            i = i + 20;
             steps = steps + 20;
              
        }
        // System.out.print(min + "\t" + c);
        
        
    }
}
