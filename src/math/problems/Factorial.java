package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
/*
 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
 * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
 *
 */
public class Factorial {

    // recursive method to find factorial of given number
    static int factorial(int x)
    {
        if (x == 0)
            return 1;

        return x*factorial(x-1);
    }

    //iterative method to find factorial of given number

    static int fact(int x)
    {
        int f = 1, i;
        for (i=2; i<=x; i++)
            f =f* i;
        return f;
    }
    // Driver method
    public static void main(String[] args)
    {
        int x = 5;
        System.out.println("Factorial of "+ x + " is " + factorial(5));
        System.out.println("Factorial of "+ x + " is " + fact(5));
    }
}











