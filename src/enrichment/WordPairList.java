package enrichment;

import java.util.ArrayList;

public class WordPairList
{

    private ArrayList<Wordpair> allPairs;

    public WordPairList(String[] words)
    {
        for(int i = 0; i < words.length; i++)
        {
            for (int j = i + 1; j < words.length; j++)
            {
                allPairs.add(new Wordpair(words[i], words[j]));
            }
        }
    }

    public int numMatches()
    {
        int var = 0;

        for(Wordpair wp : allPairs)
        {
            if(wp.getFirst().equals(wp.getSecond()))
            {
                var++;
            }
        }
        return var;
    }






}
