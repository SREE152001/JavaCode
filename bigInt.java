mport java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class bigInteger {
    public static void main(String[] nnd)
    {
        Scanner scan=new Scanner(System.in);
        BigInteger num=scan.nextBigInteger();
        scan.close();
        if(num.isProbablePrime(1))
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        
    }
    
}
