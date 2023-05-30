import java.util.Scanner;
/*-Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.*/


public class MinAndMaxInputChallenge_2 {

    public static void main(String[] args) {
        int min, max;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number  :");
        int n = sc.nextInt();

        min = max = n;

        while (n != 0) {

            System.out.print("Enter the value");
            n = sc.nextInt();

         //   if (n >= '0' && n <= '9') {

              //System.out.println("number is valid ");
        // } else
              // System.out.println("number is invalid");

            if (n < min) {
                min = n;
            }


            if (n > max) {

                max = n;
            }


            System.out.println("min: " + min);
            System.out.println("min: " + max);


        }
        sc.close();
    }
}
