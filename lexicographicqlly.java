import java.util.Scanner;

/**
 *
 * @author leo
 */
public class lexicographicqlly {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        String minSubstring = line.substring(0,k);
        String maxSubstring = line.substring(0,k);
         for (int i = 1; i < line.length()-k+1/*10*/; i++) {
            String sub = line.substring(i,i+k);
            if (sub.compareTo(minSubstring) < 0) {
                minSubstring = sub;
            }
            if (sub.compareTo(maxSubstring) > 0) {
                maxSubstring = sub;
            }
        }
        System.out.println(minSubstring);
        System.out.println(maxSubstring);
        String a="wel";
        String b="jva";
        // System.out.println(a.compareTo(b));
        
      
        //welcometojava
      
        // System.out.println( maxSubstring.compareTo(minSubstring));
    }
}
