package nyc.c4q.ac21.ac20150322;

/**
 * Created by alvin2 on 3/22/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.util.Scanner;


public class ASCII {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input a character or string: ");
        String text = input.nextLine();
        //char character = input.next().charAt(0);

        //System.out.println(isUppercaseLetter(character));
        //System.out.println(isLowercaseLetter(character));
        System.out.println(rotCalc(text));

    }



    public static boolean isUppercaseLetter(char c) {



        int encoded = (int) c;


        if (encoded <= 90 && encoded >= 65) {
            return true;
        } else {
            return false;
        }

    }


    public static boolean isLowercaseLetter(char c) {



        int encoded = (int) c;


        if (encoded <= 122 && encoded >= 97) {
            return true;
        } else {
            return false;
        }

    }


    public static String rotCalc(String words) {


        String result = "";
        for (int i=0; i < words.length(); i++) {


            int encoded = (int) words.charAt(i);


            encoded += 12;

            if (encoded > 122){   // more specific range must go FIRST !
                encoded -= 26;
            } else if (encoded > 90){
                encoded -= 26;
            }


            char decoded = (char) encoded;


            result += decoded;
        }


        return result;
    }



}
