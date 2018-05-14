package tool.url;

import java.io.UnsupportedEncodingException;

public abstract class UrlFactory {
    abstract  String encodeUrl(String url) throws UnsupportedEncodingException;
}
