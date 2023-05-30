/*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.*/

import java.util.Scanner;

public class EvenDigitSum_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        System.out.println("Ths sum of Even numbers are " + getEvenDigitSum(n));
        getEvenDigitSum(n);

    }

public static int getEvenDigitSum(int number)
{

    int sum=0;
    int mod;
    int number1;

    if (number <0)
    {

        return-1;
    }
    else
    {
       while (number > 0) {
            mod = number % 10;
            if(mod%2==0) {
                sum = sum + mod;
            }
            number = number / 10;
        }
    }

    return sum;
}


}

