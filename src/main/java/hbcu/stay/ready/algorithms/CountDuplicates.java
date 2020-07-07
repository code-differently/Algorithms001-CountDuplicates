package hbcu.stay.ready.algorithms;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        int numDuplicates = 0;
        HashMap <String, Integer> hm = new HashMap <String, Integer>();
        for(String element : input) {
            if(hm.containsKey(element)) {
                hm.put(element, hm.get(element) + 1);
            }
            else {
                hm.put(element, 1);
            }
        }
        //Can't use raw types, so have to specify Integer Integer
        //only count it if you have greater than one for the value
        for(Map.Entry <String, Integer> val : hm.entrySet()) {
            if(val.getValue() > 1) {
                numDuplicates++;
            }
        }
        return numDuplicates;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        int numDuplicates = 0;
        HashMap <Integer, Integer> hm = new HashMap <Integer, Integer>();
        for(int element : input) {
            if(hm.containsKey(element)) {
                hm.put(element, hm.get(element) + 1);
            }
            else {
                hm.put(element, 1);
            }
        }
        //Can't use raw types, so have to specify Integer Integer
        //only count it if you have greater than one for the value
        for(Map.Entry <Integer, Integer> val : hm.entrySet()) {
            if(val.getValue() > 1) {
                numDuplicates++;
            }
        }
        return numDuplicates;
    }
}
