/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)*/


import java.util.Scanner;

public class PrimeNumber_12 {


    public static void main(String[] args) {

        int num;

        int i=5;

        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number ");
        num = sc.nextInt();

        while (i <= num / 2) {
            if (num % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        if (!flag) {
            System.out.println(num + "is a prime number");
        } else {
            System.out.println(num + "is not a  prime number");
        }
    }

}


