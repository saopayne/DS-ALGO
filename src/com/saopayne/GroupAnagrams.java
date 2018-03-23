package com.saopayne;

import java.util.*;

/**
 * Created by ademola on 23/03/2018.
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramList = new ArrayList<List<String>>();
        Map<String, List<String>> anagramMap = new HashMap<String, List<String>>();
        for (int wordIndex = 0; wordIndex < strs.length; wordIndex++){
            String word = strs[wordIndex];
            char[] sortedArr = word.toCharArray();
            Arrays.sort(sortedArr);
            String sorted = new String(sortedArr);

            if (anagramMap.containsKey(sorted)) {
                anagramMap.get(sorted).add(word);
            } else {
                anagramMap.put(sorted, new ArrayList<String>());
                anagramMap.get(sorted).add(word);
            }
        }

        for (String key: anagramMap.keySet()){
            anagramList.add(anagramMap.get(key));
        }

        return anagramList;
    }

}
