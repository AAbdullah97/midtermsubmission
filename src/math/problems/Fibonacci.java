package math.problems;

/*
          Write 40 Fibonacci numbers with java.
         */

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 40;
        //printing 0 and 1
        System.out.print(n1 + " " + n2);

        for (i = 2; i <= count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }


}

