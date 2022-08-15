class factorials extends pascaltriangle
{
    public  void factorial(int n)
    {
        int c;
        long result=1;
        for(c=1;c<n;c++)
        {
            result=result*c;
                   }
    
         System.out.println(result);

    }
}
public class pascaltriangle {
    public static void main(String[] vhhv)
    {
        int num;
        Scanner scan=new Scanner(System.in);
         num=scan.nextInt();
         
        factorials obj=new factorials();
        for(int i=0;i<num;i++)
        {
            for(int c=0;c<=(num-i-2);c++)
            {
                System.out.print(" ");
                for(c=0;c<=i;c++)
                {
                   int ans;
                   obj.factorial(i/c*(i-c));
                    
                   
                }
                 System.out.println();
            }
        }
    }
}
