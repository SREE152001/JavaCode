import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class anagram {
    
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        //just texting for github
        //branching merge
        boolean R=false;
       a=a.toLowerCase();
       b=b.toLowerCase();
       char[] inp=a.toCharArray();
       Arrays.sort(inp);
       char[] inp2=b.toCharArray();
       Arrays.sort(inp2);
       String c = new String (inp);
      String d = new String (inp2);
       if(c.equals(d))
       {
           R=true;
       }
       return R;
    }

    
    
     public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret==true) ? "Anagrams" : "Not Anagrams" );
    }
}
    
