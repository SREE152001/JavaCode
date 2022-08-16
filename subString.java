mport java.util.Scanner;

/**
 *
 * @author leo
 */
public class string_Test {
    public static void main(String[] vdkv)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.concat(B).length());
       
        if(A.equals(B))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
         A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
         B = (B.substring(0,1)).toUpperCase() + B.substring(1);
         System.out.println(A + " " + B);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         /*// get First letter of the string
        String firstLetStr = A.substring(1, 1);//SUBTRING (BEGININDEX   ENDINDEX)
        // Get remaining letter using substring
        String remLetStr = A.substring(1, 1);
 
        // convert the first letter of String to uppercase
        firstLetStr = firstLetStr.toUpperCase();
        
       // concantenate the first letter and remaining string
        String firstLetterCapitalizedName = firstLetStr + remLetStr;
        System.out.println(firstLetterCapitalizedName);*/
    }
    
}
