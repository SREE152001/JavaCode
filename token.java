import java.util.Scanner;

/**
 *
 * @author leo
 */
public class token_split {
    public static void main(String[] bjcw)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();//removes all space from text expect for single space between words
        // System.out.println(input);
        scan.close();
       // System.out.println(input);
        String[] tokens = input.split("[^\\p{Alpha}]+");//^  \\p  {Alpha} 
        
        int size = (input.isEmpty()) ? 0 : tokens.length;
        System.out.println(size);
        
        for(String s : tokens) {
            System.out.println(s);
        }
    }
}
