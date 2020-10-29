//write a java program to check the number is amstrong or not
public class amstrongnum
 {
    public static void main(String[] args) 
    {
        int num = 153, originalnum, reminder, result = 0;

        originalnum = num;

        while (originalnum != 0)
        {
            reminder = originalnum % 10;
            result += Math.pow(reminder, 3);
            originalnum /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}