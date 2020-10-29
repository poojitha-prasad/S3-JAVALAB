//write a java program to find the factor of a given number
public class factorofnum
 {
    public static void main(String[] args) 
    {
        int num = 60;
        System.out.print("Factors of " + num + " are: ");

        for (int i = 1; i <= num; ++i) 
        {

            if (num % i == 0)
            {

                System.out.print(i + " ");

            }
        }
    }
}