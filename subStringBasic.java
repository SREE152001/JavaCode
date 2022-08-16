import java.util.Scanner;

/**
 *
 * @author leo
 */
public class stringtest2 {
    public static void main(String[] mbcdd)
    {
         Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        S = (S.substring(0,1)).toUpperCase() + S.substring(1); 
        System.out.println(S);
        String s = S.substring(start,end);
        System.out.println(s);
    }
    
}
