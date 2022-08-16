import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currency {
    public static void main(String[] bck)
    {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        /*
        The Java String. format() method returns the formatted string by a given locale, format, and argument. 
        If the locale is not specified in the String. format() method, it uses the default locale by calling the Locale.
        */
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(payment);
        
       NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = n1.format(payment);
        
        
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);
        
        
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);//if the object is created without new keyword 
        String france = n3.format(payment);                                //there is private constructor 
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
}
