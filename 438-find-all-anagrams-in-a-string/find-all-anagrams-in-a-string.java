import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        for (int i = p.length(); i < s.length(); i++) {
            if (Arrays.equals(pCount, windowCount)) {
                result.add(i - p.length());
            }

            windowCount[s.charAt(i - p.length()) - 'a']--;
            windowCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, windowCount)) {
            result.add(s.length() - p.length());
        }

        return result;
    }
}