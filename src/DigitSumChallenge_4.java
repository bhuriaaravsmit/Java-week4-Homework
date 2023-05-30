
import java.util.Scanner;
public class DigitSumChallenge_4 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int n=sc.nextInt();
        System.out.println("Sum of Digits " + sumDigits(n));


   //   sumDigits(n);
    }


    public static int sumDigits(int number) {
        int sumDig=0;
        int mod,m1,s;

        if (number >= 10) {

            while(number>0) {
                mod = number % 10;
                number= number / 10;
                sumDig = sumDig + mod;
            }
        }

        else {
            return -1;
        }
      return sumDig;
    }

    }


