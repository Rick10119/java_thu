// Example for PPT Page No.25

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ��ȡWeb��ҳ���ݣ���ȡͼ���URL

public class WebCrawler3 {
    public static void main(String[] args) {
        // ���弴�����ʵ�����
         String url = "http://www.baidu.com";
//        String url = args[0];
        // �������Ӳ���ȡҳ������
        String result = SendGet(url);

        // ����ʶ��ʶ��ÿ�� html Ԫ�ز���ӡ
        String r = new String(result);


        // ʹ������ƥ��ͼƬ��src����
        String imgSrc = RegexString(result, "<img.*src=(.*?)[^>]*?>");
        System.out.println(result);
        // ��ӡ���
        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println(imgSrc);

    }

    static String SendGet(String url) {
        // ����һ���ַ��������洢��ҳ����
        String result = "";
        // ����һ�������ַ�������
        BufferedReader in = null;
        try {
            // ��stringת��url����
            URL realUrl = new URL(url);
            // ��ʼ��һ�����ӵ��Ǹ�url������
            URLConnection connection = realUrl.openConnection();
            // ��ʼʵ�ʵ�����
            connection.connect();
            // ��ʼ�� BufferedReader����������ȡURL����Ӧ
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            // ������ʱ�洢ץȡ����ÿһ�е�����
            String line;
            while ((line = in.readLine()) != null) {
                // ����ץȡ����ÿһ�в�����洢��result����
                result += line;
            }
        } catch (Exception e) {
            System.out.println("����GET��������쳣��" + e);
            e.printStackTrace();
        }
        // ʹ��finally���ر�������
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    static String RegexString(String targetStr, String patternStr) {
        // ����һ����ʽģ�壬����ʹ���������ʽ����������Ҫץ������
        // �൱�����������ƥ��ĵط��ͻ����ȥ
        Pattern pattern = Pattern.compile(patternStr);
        // ����һ��matcher������ƥ��
        Matcher matcher = pattern.matcher(targetStr);
        // ����ҵ���
        if (matcher.find()) {
            // ��ӡ�����
            return matcher.group();
        }
        return "Nothing";
    }
}