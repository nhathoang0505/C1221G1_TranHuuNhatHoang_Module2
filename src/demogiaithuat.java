import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demogiaithuat {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
//            System.out.println(content);
            // regex
//            Pattern p = Pattern.compile("the-gioi/cang-thang-nga-ukraine.htm\">(.*?)</a>");
//            <a data-content-name="category-timeline_page_1" data-content-piece="category-timeline_page_1-position_5" data-content-target="/the-gioi/anh-ve-tinh-he-lo-chien-thuat-ukraine-cam-chan-luc-luong-nga-ap-sat-kiev-20220311082137392.htm" data-track-content="" href="
            Pattern p = Pattern.compile("data-track-content=\"\" href=\"/the-gioi/([a-z]+)(-[a-z]*)*\\d+\\.htm\"> <img(.*?)alt=\"(.*?)\"(.*?)\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {

//                String s = m.group(3).replaceAll("^ <img(.*?)\">$", "");
//                String s = m.group(3).replaceAll(" <img loading=\"lazy\" width=\"552\" height=\"368\" alt=\"Mỹ có thể chấm dứt quan hệ thương mại bình thường với Nga\" src=\"https://icdn.dantri.com.vn/zoom/552_368/2022/02/11/biden-crop-1644542291067.jpeg\" srcset=\"https://icdn.dantri.com.vn/zoom/552_368/2022/02/11/biden-crop-1644542291067.jpeg 1x, https://icdn.dantri.com.vn/zoom/1104_736/2022/02/11/biden-crop-1644542291067.jpeg 2x\">", "");
                System.out.println(m.group(4));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
