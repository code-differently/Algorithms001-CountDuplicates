package hbcu.stay.ready.algorithms;


import java.util.Arrays;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     *
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input) {
        Arrays.sort(input);
        Integer duplicates = 0;
        Object currentValue = null;
        for(int i = 0; i < input.length - 1; i++) {
            if(input[i] == input[i + 1] && input[i] != currentValue) {
                duplicates++;
                currentValue = input[i];
            }
        }
        return duplicates;
    }


    /**
     * Example of overloading a function that accepts a Array of Integers
     *
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input) {
        Arrays.sort(input);
        Integer duplicates = 0;
        Integer currentValue = null;
        for (int i = 0; i < input.length - 1; i++) {
               if (input[i] == input[i + 1] && (!input[i].equals(currentValue))){
                    duplicates++;
                    currentValue = input[i];
                }

        }
        return duplicates;
    }
}



