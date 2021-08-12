import java.util.Locale;

public class Part2
{
    public String findSimpleGene(String dna, String startCodon, String stopCodon)
    {
        char[] charDNA = dna.toCharArray();
        // check whether is lower, remember
        boolean isLower = Character.isLowerCase(charDNA[0]) && Character.isLowerCase(charDNA[charDNA.length - 1]);
        dna = dna.toUpperCase();
        int posATG = dna.indexOf(startCodon);
        int posATT = dna.indexOf(stopCodon);
        // Debug
        System.out.println("posATG: " + posATG);
        System.out.println("posATT: " + posATT);

        if ( posATG == -1)
        {
            return "";
        }
        else if (posATT == -1)
        {
            return "";

        }
        else if((posATT + 3  - posATG) % 3  != 0)
        {
            return "";
        }

        if (isLower)
        {
            return dna.substring(posATG, posATT + 3).toLowerCase();
        }
        else
            return dna.substring(posATG, posATT + 3);
    }

    public void testSimpleGene()
    {
        String DNAwNoATG = new String("AAAGCTAA");
        System.out.println("Testing " + DNAwNoATG);
        System.out.println("found: " + findSimpleGene(DNAwNoATG, "ATG", "TAA") + "\n");

        // DNA with no “TAA”
        String DNAwNoTAA = new String("AATGAGCTAG");
        System.out.println("Testing " + DNAwNoTAA );
        System.out.println("found: " + findSimpleGene(DNAwNoTAA, "ATG", "TAA") + "\n");
        // DNA with no “ATG” or “TAA”
        String DNAwNoATGorTAA = new String("AATAGCTAG");

        System.out.println("Testing " + DNAwNoATGorTAA);
        System.out.println("found: " + findSimpleGene(DNAwNoATGorTAA, "ATG", "TAA") + "\n");

        // DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene)
        String DNAwATGandTAAmulti = new String ("AGATGCGATACGCTTAATC");
        String lowerMulti = new String ("AGATGCGATACGCTTAATC").toLowerCase();

        System.out.println("Testing " + DNAwATGandTAAmulti);
        System.out.println("found: " + findSimpleGene(DNAwATGandTAAmulti, "ATG", "TAA") + "\n");


        System.out.println("Testing " + lowerMulti);
        System.out.println("found: " + findSimpleGene(lowerMulti, "ATG", "TAA") + "\n");


        String DNAwATGandTAA = new String("AGATGCGATACGCTAA");

        System.out.println("Testing " + DNAwATGandTAA );
        System.out.println("found: " + findSimpleGene(DNAwATGandTAA, "ATG", "TAA") + "\n");
    }

}
