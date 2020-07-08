package hbcu.stay.ready.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        int dupeCount = 0;
        ArrayList<String> dupes = new ArrayList<String>();
        Arrays.sort(input);
        for (int i = input.length - 1; i > 0; i--) {
            if (!dupes.contains(input[i])) {
                if (input[i].equals(input[i - 1])) {
                    dupeCount++;
                    dupes.add(input[i]);
                }
            }
        }
        return dupeCount;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        int dupeCount = 0;
        ArrayList<Integer> dupes = new ArrayList<Integer>();
        Arrays.sort(input);
        for (int i = input.length - 1; i > 0; i--) {
            if (!dupes.contains(input[i])) {
                if (input[i] == input[i - 1]) {
                    dupeCount++;
                    dupes.add(input[i]);
                }
            }
        }
        return dupeCount;
    }
}
