package information;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.PrintWriter;

public class Images
{

    static Document doc;
    public static void images()
    {
        try {
            PrintWriter writer = new PrintWriter("Images.txt", "UTF-8");
            doc = Jsoup.connect("https://www.imdb.com/chart/top?ref_=lgn_nv_wl_img_3").get();
            Elements pics = doc.select("td.posterColumn");
            for (Element pic : pics)
            {
                Elements links = pic.getElementsByTag("img");
                String link = links.attr("src") + "\n";
                writer.write(link);
            }
            writer.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

