import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author leo
 */
public class Calender {
    public static String getDay(String day,String month,String year)
    {
     int d=Integer.parseInt(day);
     int m=Integer.parseInt(month);
     int y=Integer.parseInt(year);
        
       LocalDate it= LocalDate.of(y,m,d); 
       return it.getDayOfWeek().name();
    }
    
    
    public static void main(String[] blcd)
    {
     Scanner scan=new Scanner(System.in); 
     String day=scan.next();
      String month=scan.next();
       String year=scan.next();
        System.out.println(getDay(day,month,year));
        
        
    }
    
}

