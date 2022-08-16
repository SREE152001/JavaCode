import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author leo
 */
public class valid_username {
    public static void main(String[]kjgkg)
    {
        Scanner scan=new Scanner(System.in);
       String regex ="^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        Pattern p =Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        int count=scan.nextInt();
        while(count-- >0)
        {
             String username=scan.next();
             Matcher m=p.matcher(username);
             if(m.find())
             {
                 System.out.println("valid");
             }
             else{
                 System.out.println("invaild");
             }
             
        }
        scan.close();
    }
    
}
