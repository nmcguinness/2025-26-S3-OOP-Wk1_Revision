import java.util.Scanner;

public class Exercises {

    // 10, 25 -> 10, 25, 24 etc
    public static int getRandomInRange(int min, int max) {
        return (int)Math.round(Math.random() * (max - min)  + min);
    }


    public static void Exercise4()
    {
        //generate number - Random
        int secretRandom = getRandomInRange(1, 100);
        boolean bContinue = true;

        Scanner sc = new Scanner(System.in);
        int guessRandom = -1;

        while(bContinue) {
            System.out.println("Enter a random number: ");
            guessRandom = sc.nextInt();
            if (guessRandom == secretRandom) {
                System.out.println("You guessed it!");
                bContinue = false;
            }
            else if (guessRandom < secretRandom)
                System.out.println("You're too low!");
            else
                System.out.println("You're too high!");
        }

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
