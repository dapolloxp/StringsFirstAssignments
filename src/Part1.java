


public class Part1
{
    public String  findSimpleGene(String dna)
    {
        /*
        Finds the index position of the start codon “ATG”. If there is no “ATG”, return the empty string.



        Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found.
        If there is no such “TAA”, return the empty string.

        If the length of the substring between the “ATG” and “TAA” is a multiple of 3,
        then return the substring that starts with that “ATG” and ends with that “TAA”.
         */

        int posATG = dna.indexOf("ATG");
        int posATT = dna.indexOf("TAA");
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

        return dna.substring(posATG, posATT + 3);
    }

    public void testSimpleGene()
    {
        /*
        Print the DNA string.

        See if there is a gene by calling findSimpleGene with this string as the parameter.
        If a gene exists following our algorithm above, then print the gene, otherwise print the empty string.
         */

        // DNA with no “ATG”
        String DNAwNoATG = new String("AAAGCTAA");
        System.out.println("Testing " + DNAwNoATG);
        System.out.println("found: " + findSimpleGene(DNAwNoATG) + "\n");

        // DNA with no “TAA”
        String DNAwNoTAA = new String("AATGAGCTAG");
        System.out.println("Testing " + DNAwNoTAA );
        System.out.println("found: " + findSimpleGene(DNAwNoTAA) + "\n");
        // DNA with no “ATG” or “TAA”
        String DNAwNoATGorTAA = new String("AATAGCTAG");

        System.out.println("Testing " + DNAwNoATGorTAA);
        System.out.println("found: " + findSimpleGene(DNAwNoATGorTAA) + "\n");

        // DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene)
        String DNAwATGandTAAmulti = new String ("AGATGCGATACGCTTAATC");

        System.out.println("Testing " + DNAwATGandTAAmulti);
        System.out.println("found: " + findSimpleGene(DNAwATGandTAAmulti) + "\n");


        String DNAwATGandTAA = new String("AGATGCGATACGCTAA");

        System.out.println("Testing " + DNAwATGandTAA );
        System.out.println("found: " + findSimpleGene(DNAwATGandTAA) + "\n");



        String q1 = new String("AAATGCCCTAACTAGATTAAGAAACC");

        System.out.println("Testing q1: " + q1 );
        System.out.println("found: " + findSimpleGene(q1) + "\n");

    }
}
