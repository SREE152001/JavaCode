mport java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * ^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\.(?!$)|$)){4}$

# Explanation
(
  [0-9]         # 0-9
  |             # or
  [1-9][0-9]    # 10-99
  |             # or
  1[0-9][0-9]   # 100-199
  |             # or
  2[0-4][0-9]   # 200-249
  |             # or
  25[0-5]       # 250-255
)
(\.(?!$)|$))    # ensure IPv4 doesn't end with a dot
{4}             # 4 times.
 * @author leo
 */
class ReGex
{
    boolean R;
     boolean regularexpression(String s)
    {
      Pattern p=Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");
        Matcher m=p.matcher(s);
       if(m.find())
       {
           R=true;
           System.out.println(R);
       }
       else{
           R=false;
           System.out.println(R);
       }
        
         return R;
    } 
     
}
public class ipaddress {
    public static void main(String[] fuft)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        
         ReGex o=new  ReGex();
         o.regularexpression(s);
         
         
        
    }
    
}

