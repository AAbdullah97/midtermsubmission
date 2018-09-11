package string.problems;
import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;
/*
 * Write a java program to find the duplicate words and their number of occurrences in the string.
 * Also Find the average length of the words.
 */

// String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        //System.out.print("Enter string to analyse:");

              //  Scanner sn = new Scanner(System.in);

               // String input = sn.nextLine();

        // split string into words

                String[] words = st.split(" ");

                // adds all words into a map

                // check whether the word is already in map!

                Map<String,String> wordMap = new HashMap<String,String>();

                Map<String,String> printedMap = new HashMap<String,String>();



                for(int i=0;i<words.length;i++) {

                    String word = words[i].toUpperCase(); // for case insensitive comparison

                    if(wordMap.get(word)!=null) {

                        // we found a duplicated word!

                        if(printedMap.get(word)==null) { // first check if it is printed already!

                            System.out.println("Duplicated/Repeated word:"+word);

                            printedMap.put(word, word);

                        }

                    }else {

                        wordMap.put(word, word);

                    }

                }

            }



        }

