import java.util.Scanner;

public class PalindromeNumber_5 {


    public static void main(String[] args) {

        int c;
        int sum = 0;
        int r;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number ");
        num = sc.nextInt();
        isPalindrome(num);
        c = num;

        while (num > 0) {

            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;

        }

        if (c == sum) {
            System.out.println( "is Palindrome number" + c);


        } else {
            System.out.println("not Palindrome number" + c );

        }
    }


    public static int isPalindrome(int number) {


        return number;
    }

}