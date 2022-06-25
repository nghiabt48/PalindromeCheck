import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(String inputString)
    {
        String rev = "";
        for(int i = 0; i < inputString.length(); i++)
        {
            char ch = inputString.charAt(i);
            rev = ch + rev;
            if(inputString.equals(rev))
            {
                return true;
            }
        }
        return false;
    }

}
