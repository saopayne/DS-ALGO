package com.saopayne;

/**
 * Created by ademola on 23/03/2018.
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String str) {
        int n = str.length();
        int currLen = 1;
        int maxLen = 1;
        int prevIndex;

        int visited[] = new int[256];

        for (int i = 0; i < 256; i++) {
            visited[i] = -1;
        }

        if (n == 0) {
            return 0;
        }

        visited[str.charAt(0)] = 0;
        for (int i = 1; i < n; i++){
            prevIndex = visited[str.charAt(i)];
            if (prevIndex == -1 || i - currLen > prevIndex) {
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
                currLen = i - prevIndex;
            }
            visited[str.charAt(i)] = i;
        }

        if (currLen > maxLen) {
            maxLen = currLen;
        }

        return maxLen;
    }

}
