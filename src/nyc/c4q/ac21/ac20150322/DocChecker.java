package nyc.c4q.ac21.ac20150322;

/**
 * Created by alvin2 on 3/22/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.net.URL;
import java.util.Scanner;

public class DocChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a URL: ");
        String website = input.nextLine();

        System.out.println("enter a word: ");
        String word = input.nextLine();

        URL url = HTTP.stringToURL(website);
        String document = HTTP.get(url);

        document = document.toUpperCase();
        word = word.toUpperCase();

        document = document.replaceAll("[^A-Za-z0-9]", " ");
        // System.out.println(capDoc);


        String[] textArray = document.split(" ");

        int count = 0;


        for (int i = 0; i < textArray.length; i++) {

            if (textArray[i].contains(word)) {
                count++;
            }



        }

        System.out.println("This contains " + count + " instances of the word, " + word.toLowerCase() + "!");

    }



}
