import java.util.Scanner;

public class VowelOrConsonant_3 {


    public static void main(String[] args) {


    String ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any alphabet : ");
//|
        ch = sc.next();

        if (ch.length()== 1)
        {
            if (ch.equals("a") || ch.equals("A")  || ch.equals("u") || ch.equals("U") ||ch.equals("E") || ch.equals("e")|| ch.equals("I") || ch.equals("i")|| ch.equals("o")|| ch.equals("O"))
            {
                System.out.println("The value enter is Vowel ");}
            else {
                System.out.println("The value enter is consonant ");
            }
        }
             else {
                System.out.println("The input entered in incorrect- enter single digit");
            }
        }
    }





