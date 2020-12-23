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

public class bklChrowler {

    // the level of crawling
    static int level;
    final static int maxLevel = 3;
    static PrintWriter pw = null;
    //	set the regex
    static String regex1 = "http://[\\w+\\.?/?]+\\.[A-Za-z]+";
    static String regex2 = "https://[\\w+\\.?/?]+\\.[A-Za-z]+";
    static String regex3 = "ss";
    // [several w, one .,]
    static Pattern p1 = Pattern.compile(regex1);
    static Pattern p2 = Pattern.compile(regex2);
    static Pattern p3 = Pattern.compile(regex3);

    public static void main(String[] args) {
        level = 1;
        //            url = new URL(args[0]);
        String url = "https://www.tbsi.edu.cn";


        /** open the file the write */
        try {
            // output to url.txt
            pw = new PrintWriter(new FileWriter("url.txt"), true);
            /** start to find */
            findHttps(url);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close the file
            pw.close();
        }

    }


    /**
     * the method to find the sites
     */
    public static void findHttps(String url) {


        URLConnection urlconn = null;
        BufferedReader br = null;

        try {
            urlconn = new URL(url).openConnection();

            br = new BufferedReader(new InputStreamReader(urlconn.getInputStream()));

            String buf = null;
            while ((buf = br.readLine()) != null) {
                //	show the input
//                System.out.println(buf);

                Matcher buf_m1 = p1.matcher(buf);
                Matcher buf_m2 = p2.matcher(buf);
                Matcher buf_m3 = p3.matcher(buf);

                //	detect match
                while (buf_m1.find() || buf_m2.find() || buf_m3.find()) {
                    if (buf_m1.find() && buf_m1.group() != null) {
                        pw.println(buf_m1.group());
                        if (level <= maxLevel) {
                            level++;
                            findHttps(buf_m1.group());
                            level--;
                        }

                    }
                    if (buf_m2.find() && buf_m2.group() != null) {
                        pw.println(buf_m2.group());
                        if (level <= maxLevel) {
                            level++;
                            findHttps(buf_m2.group());
                            level--;
                        }
                    }

//                    /** p3 is matched */
//                    if (buf_m3.find() && buf_m3.group() != null) {
//                        pw.println(buf_m3.group());
//
//                    }


                }
            }
            System.out.println("end.");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //	close
        finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


}
