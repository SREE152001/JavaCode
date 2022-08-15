import java.util.Scanner;

/**
 *
 * @author leo
 */
public class stringPalindrome {
    public static void main(String[] jbck)
    {
        /*
        String a="sree";
        System.out.println(a.length());*/
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String word=scan.next();
        System.out.println("you have entered : " + word);
        int lengths=word.length();
        String rev="";
        for(int i=lengths-1;i>=0;i--)
        {
            rev=rev+word.charAt(i);//chatAt() ia method return at a specific index position ina string, the first char has the position 0
        }
        if(word.equals(rev))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
        }
        
    }
    
