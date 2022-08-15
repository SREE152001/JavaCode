public class duplicateChar {
    public static void main(String[] bjkcb)
    {
        String str="w3schools";
        int ctn=0;
        char[] inp=str.toCharArray();
        System.out.println("your duplicate char are ...");
        for(int i=0;i<str.length();i++)
        {
           for(int j=1+i;j<str.length();j++) 
           {
               
               if(inp[i]==inp[j])
               {
                   System.out.println(inp[i]);
                   System.out.println(ctn);
                   ctn++;
                   break;
               }
           }
        }
        
    }
    
}
