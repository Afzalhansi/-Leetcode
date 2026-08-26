import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int[] freq = new int[26];
        int[] windowFreq = new int[26];

        int left = 0;
        int right = 0;

        boolean isAnagram = true;

        List<Integer> result = new ArrayList<>();

        // Edge case
        if (p.length() > s.length()) {
            return result;
        }

        // Build frequency of p
        while (right < p.length()) {
            freq[p.charAt(right) - 'a']++;
            right++;
        }

        // Build first window
        right = 0;

        while (right < p.length()) {
            windowFreq[s.charAt(right) - 'a']++;
            right++;
        }

        // Check first window
        for (int i = 0; i < 26; i++) {
            if (freq[i] != windowFreq[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            result.add(left);
        }

        // Slide the window
        while (right < s.length()) {

            // Remove left character
            windowFreq[s.charAt(left) - 'a']--;

            // Add right character
            windowFreq[s.charAt(right) - 'a']++;

            left++;
            right++;

            // Check new window
            isAnagram = true;

            for (int i = 0; i < 26; i++) {
                if (freq[i] != windowFreq[i]) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                result.add(left);
            }
        }

        return result;
    }
}