public class data_quantity {
    public static void main(String[] bkcw)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();
        long x;
        for(int i=0;i<num;i++)
        {
            try
            {
            x=scan.nextLong();
         System.out.println(x+" can be fitted in:");


                if(x>=-128 && x<=127)System.out.println("* byte");


                if(x>=-32768 && x<=32767)System.out.println("* short");


                if(x>=-2147483648 && x<= 2147483647)System.out.println("* int");


               if(x>=-9223372036854775808L && x<= 9223372036854775807L)System.out.println("* long");
      
        
        }
             catch(Exception e)


            {


                System.out.println(scan.next()+" can't be fitted anywhere.");


            }
        }
        
    
}
}
