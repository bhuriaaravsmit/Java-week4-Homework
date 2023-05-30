
import java.util.Scanner;

/*1. Read 10 numbers from the console entered by the user and print the sum of those
numbers.*/


public class ReadingUserInputChallenge_1 {


    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);


            while (counter <= 10) {
                System.out.println(" Enter the  numbers  #" +counter);
                if (sc.hasNextInt()) {
                    int n = sc.nextInt();
                    sum = sum + n;
                }
                else {
                    System.out.println("Invalid number");
                }

                counter++;
            }
            System.out.println(" Sum : " + sum);
            sc.close();

    }

}
        // System.out.println("Enter invalid");





//