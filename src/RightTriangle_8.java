/*Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@*/



public class RightTriangle_8 {


    public static void main(String[] args) {


        RightTriangle_8 p = new RightTriangle_8();
        p.print();

    }

    public void print() {


        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("@ " + " ");
            }

            System.out.println();
        }

    }

}