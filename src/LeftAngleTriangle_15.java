public class LeftAngleTriangle_15 {


    public static void main(String[] args) {
        int n=5;


        LeftAngleTriangle_15 l=new LeftAngleTriangle_15();
        l.leftstar(n);

    }

    public void leftstar(int n){

        int a,b;

        //for loop

        for(a=0;a<n ;a++);
        {
            //nested 2nd for loop

            for (b = 2 * (n - a); b >= 0; b--) {

                System.out.print(" ");

            }

        }     //nested 3rd loop

            for (b=0;b<=a;b++)

            {

                System.out.print("*");


            }

            System.out.println( );
        }





}
