mport java.util.Scanner;

/**
 *
 * Java's System.out.printf function can be used to print formatted output.
 * The purpose of this exercise is to test your understanding of formatting output using printf.

To 
 * 
 * 
 * In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters 15 character.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
 */
public class sout_test {
    public static void main(String[] hjmv)
    {
       Scanner scan=new Scanner(System.in);
        System.out.println("=======================================");
        for(int i=0;i<3;i++)
        {
            String str=scan.next();
            int num=scan.nextInt();
            //printf function
            System.out.printf("%-15s %03d\n",str,num);//System.out.printf function can be used to print formatted output
            //left side 15 space right side 3 space
        }
        System.out.println("=======================================");
        
    }
    
}
/*
%-15s" means that within 15 blank space, the String "s1" will be filled in the left.
(fill in the blanks from the left) "%03d" means that within 3 0s, the integer"x" will be filled in the right.
(fill in the zeros from the right).
This can only be done by using printf method.
*/
