import java.util.Scanner;

public class Exercises {

    public static void Exercise4()
    {
        //generate number - Random

        //define number of repeats

        //for loop until repeats or we guess the number
            //if low then sout, else high, else == number
    }


    public static void Exercise2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if(a%2==0)
            System.out.println(a + " is even");
        else
            System.out.println(a + " is odd");
    }
}
