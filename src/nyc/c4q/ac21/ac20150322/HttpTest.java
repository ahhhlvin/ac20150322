package nyc.c4q.ac21.ac20150322;

/**
 * Created by alvin2 on 3/22/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
import java.net.URL;
import java.util.Scanner;

public class HttpTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter a working URL to retrieve the information: ");
        String input = scanner.nextLine();
        URL url = HTTP.stringToURL(input);
        String document = HTTP.get(url);


        String capDoc = document.toUpperCase();


        if (capDoc.contains(("!DOCTYPE HTML")) == true) {
            System.out.println("This document is HTML!");
        } else {
            System.out.println("This document is NOT HTML!");
        }


    }

}




