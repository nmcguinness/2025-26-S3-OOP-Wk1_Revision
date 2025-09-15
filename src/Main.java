
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int a = 5;  //double is 8-bytes
        int b = 9;     //int is 4-bytes

        double result = a/b;  //typecast
        System.out.println("Result is " + result);

        System.out.println(divide(12, 15));
        System.out.println(divide(100.0, 25.1));
    }

    //We're overloading a method
    public static double divide(int a, int b)
    {
        return (double)a/b;
    }

    public static double divide(double a, double b)
    {
        return a/b;
    }
}