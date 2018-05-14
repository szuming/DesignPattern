package tool.url;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class testEncoder {
    public static void main(String []argv) throws UnsupportedEncodingException {
        Scanner reader=new Scanner(System.in);
        String url=reader.next();
        UrlFactory urlFactory=new MDUrlFactory();
        url=urlFactory.encodeUrl(url);
        System.out.println(url);
    }
}
