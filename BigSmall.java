import java.util.Scanner;

/**
 *
 * @author leo
 */
public class bigsmallArray {
    public static void main(String[] bvxx)
    {
        int num;
        int[] arr=new int[10];
        System.out.println(arr.length);
        Scanner scan = new Scanner(System.in);
        int smallest = arr[0];
        int largest = arr[0];
        System.out.println("enter the number");
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
            
        }
         for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>largest)
           {
              largest=arr[i];
           }
           else if(arr[i]<=smallest)
           {
               smallest=arr[i];
           }
            
        }
         System.out.println("greatest = " + largest);
         System.out.println("smallest = " + smallest);
        
      
   
      
        
    }
    
}
