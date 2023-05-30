/*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
        The method needs to find the first and the last digit of the parameter number passed to the method,
        using a loop and return the sum of the first and the last digit of that number.
        If the number is negative then the method needs to return -1 to indicate an invalid value*/

import java.util.Scanner;

public class FirstAndLastDigitSum_7 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number"  );

        int n = sc.nextInt();

        System.out.print("sum of the number" + sumFirstAndLastDigit(n) );
        sumFirstAndLastDigit(n);


    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int mod;int number1;
        if (number < 0) {

            return -1;
        } else {

            sum = number%10;
            number = number / 10;
            while (number > 0) {
                mod = number % 10;
                if(number<10) {
                    sum = sum + mod;
                }
                number = number / 10;
            }
        }

        return sum;
    }


}



