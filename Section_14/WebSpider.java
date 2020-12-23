// Example for PPT Page No.25

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebSpider {
    public static void main(String[] args) {
        URL url = null;
        URLConnection urlconn = null;
        BufferedReader br = null;
        PrintWriter pw = null;

        //	设置对http和https同时有效的匹配（正则表达式）
        String regex1 = "http://[\\w+\\.?/?]+\\.[A-Za-z]+";
        String regex2 = "https://[\\w+\\.?/?]+\\.[A-Za-z]+";

        Pattern p1 = Pattern.compile(regex1);
        Pattern p2 = Pattern.compile(regex2);

        try {
            	url = new URL("http://www.baidu.com/");
//            url = new URL(args[0]);
            urlconn = url.openConnection();
//
            //将收集到的链接输出到文本文件 url.txt
            pw = new PrintWriter(new FileWriter("url.txt"), true);

            br = new BufferedReader(new InputStreamReader(urlconn.getInputStream()));

            String buf = null;
            while ((buf = br.readLine()) != null) {
                //	显示读入的内容
                //	System.out.println(buf);

                Matcher buf_m1 = p1.matcher(buf);
                Matcher buf_m2 = p2.matcher(buf);

                //	检测是否找到匹配的内容
                while (buf_m1.find() || buf_m2.find()) {
                    if (buf_m1.find()) {
                        pw.println(buf_m1.group());
                    }
                    if (buf_m2.find()) {
                        pw.println(buf_m2.group());
                    }

                }
            }
            System.out.println("检查结束！");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //	保证文件正常关闭
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            pw.close();
        }
    }
}  
