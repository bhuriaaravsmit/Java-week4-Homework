import java.util.Scanner;
/*Print the sequence(Fib 1 1 2 3 5 8 13 21 Fibonacci number*/

public class FibonacciNumber {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");

        int n = sc.nextInt();

       // Scanner sc=new Scanner(System.in);
        //System.out.print("Enter the number ");
       // int n =sc.nextInt();

        FibonacciNumber f = new FibonacciNumber();
        f.fibo(n);

    }

    public void fibo(int n) {
        int a = 1;
        int b = 1;
        int c=0;
        int i =0;

        while (i <= n) {

            System.out.print( a +" " );

            //swapping
            c = a+ b;
            a = b;
            b = c;
          i++;


        }

    }


}




