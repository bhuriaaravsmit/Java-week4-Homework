/*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.*/

import java.util.Scanner;

public class SharedDigit_13 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int m = sc.nextInt();
        System.out.println("Enter the second number ");
        int n = sc.nextInt();
        System.out.println("Output "+hasSharedDigit(m, n));

    }


    public static boolean hasSharedDigit(int a, int b) {
        int number, n1, n2;
        int mod, mod1;

        if (a >= 10 && b >= 10 && a <= 99 && b <= 99) {

            mod = a % 10;
            n1 = a / 10;
            mod1 = b % 10;
            n2 = b / 10;

            if((mod ==mod1 || mod ==n2) || (n1==mod1 || n1==n2))
            {
                System.out.println(" number appears ");
                return true;
            }
            else
            {
                System.out.println("number does not appear");
                return false;

            }

        } else {
            return false;
        }


    }

}
