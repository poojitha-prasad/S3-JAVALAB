//write a java program to check given no is odd or even
import java.util.*;

public class oddoreven 
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter a number: ");
        int num;
        num = input.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is Even");
        }
        else if(num%2==1)
        {
            System.out.println(num+" is Odd");
        }
        
    }
}