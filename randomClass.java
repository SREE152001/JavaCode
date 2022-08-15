import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class random {
    public static void main(String[] mvbs)
    {
        //This Java program generates random numbers within the provided range.
        
        int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        maxRange=SC.nextInt();
        
        for(int loop=1; loop<=10; loop++)
        {
            System.out.println(rand.nextInt(maxRange)+1);//random function stop before over the 5 if we add 1 it tske 6 also
        }
        
        
        
       /*generate the number between the range
       Random rand = new Random();
        
        int minRange = 1000, maxRange= 5000;
        int value = rand.nextInt(maxRange - minRange) + minRange;
        
        System.out.println(value); */
        
        
    }
    
}
