import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true)
        {
            Palindrome p = new Palindrome();
            String inputString;
            System.out.print("Enter String: ");
            inputString = s.nextLine();
            if(inputString.equals("stop"))
            {
                break;
            }
            System.out.println(p.isPalindrome(inputString));

        }

    }

}
