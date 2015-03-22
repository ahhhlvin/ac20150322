package nyc.c4q.ac21.ac20150322;

/**
 * Created by alvin2 on 3/22/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.net.URL;

public class UrlExample {
    public static void main(String[] args) {
        URL url = HTTP.stringToURL("http://behance.net/alvinkuang");
        System.out.println(url.getHost());
        System.out.println(url);

        //
        //
        //


        breakDown(makeHttpUrl("google.com", 75, "ahhhhlvin/home"));


        System.out.println(makeHttpUrl("google.com", "ahhhhlvin/home"));

    }




    // method for when host, port, path are input by user
    public static URL makeHttpUrl(String host, int port, String path) {
       String finalURL = "http://" + host + ":" + port + "/" + path;


        return HTTP.stringToURL(finalURL);
    }



    // overloaded method is for when the port is not specified
    public static URL makeHttpUrl(String host, String path) {
        int port = 80;
        String finURL = "http://" + host + ":" + port + "/" + path;


        return HTTP.stringToURL(finURL);
    }

    // this method will break out the aspects of the URL desired
    public static void breakDown(URL url) {

        System.out.println("The protocol is: " + url.getProtocol());
        System.out.println("The host is: " + url.getHost());
        System.out.println("The port is: " + url.getPort());
        System.out.println("The path is: " + url.getPath());

    }


}
