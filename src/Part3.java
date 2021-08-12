

public class Part3
{
    public boolean twoOccurrences(String stringa, String stringb )
    {
        int pos1 = stringb.indexOf(stringa);
        int strLength = stringa.length();
        int count = 0;
        if (pos1 == -1)
        {
            return false;
        }
        count++;
        int nextPos = pos1 + strLength;

        if (stringb.substring(nextPos).indexOf(stringa) != -1)
        {
            return true;
        }
        

        return false;
    }

    public String lastPart(String stringa, String stringb)
    {
        int pos = stringb.indexOf(stringa);
        int strLength = stringa.length();
        if (pos == -1)
        {
            return stringb;
        }

        return stringb.substring(pos+strLength);
    }

    public void testing()
    {
        /*
        System.out.println(twoOccurrences("aa", "aabb"));
        System.out.println(twoOccurrences("aa", "aabbaa"));
        System.out.println(twoOccurrences("a", "banana"));
        System.out.println(twoOccurrences("atg", "ctgtatgta"));
        System.out.println(twoOccurrences("atg", "ctgtatgtatg"));
        */

        System.out.println(lastPart("an", "banana"));
        System.out.println(lastPart("zoo", "forest"));
    }
}
