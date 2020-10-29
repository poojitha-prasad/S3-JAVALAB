//write a java program to find factorial of first n numbers
public class factorial
 {
    public static void main(String[] args) 
    {
        int n = 5;
        for(int j=1;j<=5;j++)
        {
        long fact = 1;
        for(int i = 1; i <= j; ++i)
        {
            fact *= i;
        }
        System.out.printf("Factorial of %d = %d\n", j, fact);
    }
    }
}