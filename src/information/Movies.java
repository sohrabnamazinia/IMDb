package information;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.PrintWriter;

public class Movies
{
    static Document doc;
    public static void movies() throws IOException
    {
        {
            doc = Jsoup.connect("https://www.imdb.com/chart/top?ref_=nv_wl_img_3").timeout(6000).get();
            Elements films = doc.select("td.titlecolumn");
            PrintWriter writer = new PrintWriter("Movies.txt", "UTF-8");
            int i = 1;
            for (Element film : films)
            {
                writer.write(film.text() + "\n");
                i++;
            }
            writer.close();
        }
    }
}

