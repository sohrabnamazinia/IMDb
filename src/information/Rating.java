package information;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.PrintWriter;

public class Rating
{
    static Document doc;
    public static void rating()
    {
        try
        {
            doc = Jsoup.connect("https://www.imdb.com/chart/top?ref_=nv_wl_img_3").get();
            Elements links = doc.getElementsByTag("strong");
            PrintWriter writer = new PrintWriter("Rating.txt", "UTF-8");
            int i = 0;
            for (Element link : links)
            {
                i++;
                if (i == 1 || i == 2 || i == 3 || i == 4) continue;
                writer.write(link.text() + "\n");

            }
            writer.close();

        } catch (Exception e)
        {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }


    }
}


