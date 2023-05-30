

/*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/

import java.util.Scanner;

public class ArmStrong_10 {

    public static void arm() {

        int n, temp, r;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;

        }
        if (sum == temp) {
            System.out.print("number is Armstrong");
        } else {
            System.out.print("number is not armstrong");
        }

    }


    public static void main(String[] args) {

        arm();

    }






}
