//write a java program to find the sum of first "n" natural numbers
public class sumofnaturalnum
 {
    public static void main(String[] args) 
   {
        int n = 10,sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}