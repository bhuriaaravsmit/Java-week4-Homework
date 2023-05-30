
/*Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
**/
import java.util.Scanner;
public class Diamond_14 {


    public static void main(String[] args) {
        int m, p;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row ");
        int n = sc.nextInt();


        for (m = 1; m <= n; m++) {

            for (p = 1; p <= n - m; p++) {
                System.out.print(" ");
            }

            for (p = 1; p <= m * 2 - 1; p++) {
                System.out.print("*");

            }
            System.out.println();
        }


        //for outer loop

        for (m = n - 1; m > 0; m--) {
            for (p = 1; p <= n - m; p++)
                System.out.print(" ");


            for (p = 1; p <= m * 2 - 1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }



}
