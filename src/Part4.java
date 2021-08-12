import edu.duke.*;

import java.util.Locale;


public class Part4
{
    public void readURL()
    {
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        //System.out.println(ur.asString());

        for (String item : ur.words())
        {

            String itemLower = item.toLowerCase();
            int pos = itemLower.indexOf("youtube.com");
            if (pos != -1)
            {
                int beg = item.lastIndexOf("\"",pos);
                int end = item.indexOf("\"", pos+1);
                System.out.println(item.substring(beg+1,end));
            }
            /*
            if (line.toLowerCase().indexOf("youtube") != -1)
            {
                //System.out.println(line.substring(line.indexOf("\"")));
                int beg = line.indexOf("=\"");
                int end = line.lastIndexOf("\">");
                //int firstPos = line.indexOf("\"");
                //int lastPos = line.lastIndexOf("\"");
                System.out.println(line.substring(beg +2, end));

            }*/

        }
    }

}
