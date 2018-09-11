package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */

/*
 * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
 * Write Java program to compute all Permutation of a String
 *
 */
public class Permutation {

    static public void StringPermutation(String input)
            {
                StringPermutation("", input);
            }

            private static void StringPermutation(String permutation, String input)
            {
                if(input.length() == 0)
                {
                    System.out.println(permutation);
                }
                else
                {
                    for (int i = 0; i < input.length(); i++)
                    {
                        StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
                    }
                }
            }

            public static void main(String[] args)
            {
                StringPermutation("GIT");
            }
        }
