package hbcu.stay.ready.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        HashMap<String, Integer> hash = new HashMap<String, Integer>();

        for(String i : input)
        {
            hash.put(i, hash.get(i) == null ? 1 : hash.get(i) + 1);
        }

        int dup = 0;

        for(Map.Entry<String, Integer> ee : hash.entrySet())
        {
            int val = ee.getValue();

            if(val > 1)
            {
                dup++;
            }
        }

        return dup;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input)
    {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for(Integer i : input)
        {
            hash.put(i, hash.get(i) == null ? 1 : hash.get(i) + 1);
        }

        int dup = 0;

        for(Map.Entry<Integer, Integer> ee : hash.entrySet())
        {
            int key = ee.getKey();
            int val = ee.getValue();

            if(val > 1)
            {
                dup++;
            }
        }

        return dup;
    }
}
