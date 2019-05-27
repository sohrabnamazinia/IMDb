package information;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Directors
{

    static Document doc;
    public static void direcrors() throws IOException
    {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("Directors.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        doc = Jsoup.connect("https://www.imdb.com/chart/top?sort=rk,asc&mode=simple&page=1").get();
        Elements titles = doc.select("td.titleColumn");
        for (Element title : titles)
        {
            String dirAndStars = title.getElementsByTag("a").attr("title")  + "\n";
            writer.write(dirAndStars);
        }
        writer.close();


    }
}
