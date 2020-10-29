//write a java program to check given no is palindrome or not
public class palindromenum
 {
    public static void main(String[] args) 
    {
        int num = 15151, reversenum= 0, reminder, originalnum;
        originalnum = num;
        while( num != 0 )
        {
            reminder = num % 10;
            reversenum = reversenum * 10 + reminder;
            num  /= 10;
        }

        if (originalnum == reversenum)
            System.out.println(originalnum + " is a palindrome");
        else
            System.out.println(originalnum + " is not a palindrome");
    }
}