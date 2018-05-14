package tool.url;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

//D:\javaCode\DesignPattern\src\创建型模式\工厂模式\简单工厂模式\简单工厂.md
public class MDUrlFactory extends UrlFactory {
    @Override
    String encodeUrl(String url) throws UnsupportedEncodingException {
        String root="https://github.com/szuming/DesignPattern/blob/master";         //url根部
        url=url.substring(url.indexOf("src"));                                      //从src开始分割，包括src
        String []urls=url.split("\\\\");                                     //以\划分
        url= root;
        for(String temp:urls){
            url=url+"/"+URLEncoder.encode(temp,"UTF8");                         //对每一部分进行转义并拼接
        }
        return url;
    }
}
