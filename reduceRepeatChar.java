import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *remove the duplicate word using regex
 * @author leo
 */
/*/(\b\S+\b)\s+\b\1\b/
\b start of word word boundary
\W+ any word character
\1 same word matched already
\b end of word
()* Repeating again
/*
*/





 

public class duplicate_words {
    public static void main(String[] vjv)
    {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
                
            
        
        
        
        
       
    }
    
}
