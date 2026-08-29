class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int left =0;
        int right = 0;

        int[] freq = new int[26];
        int[] windowfreq = new int[26];

        if (s1.length() > s2.length()) {
            return false;
        }

        while(right < s1.length()){
            freq[s1.charAt(right) - 'a']++;
            right++;
        } 

        right = 0;

        while(right < s1.length()){
            windowfreq[s2.charAt(right) - 'a']++;
            right++;
        }
        
       boolean match = true;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != windowfreq[i]) {
                match = false;
                break;
            }
        }

        if (match) {
            return true;
        }


         while (right < s2.length()) {

            // Remove left character
            windowfreq[s2.charAt(left) - 'a']--;

            // Add right character
            windowfreq[s2.charAt(right) - 'a']++;

            left++;
            right++;

            // Check new window
            match = true;

            for (int i = 0; i < 26; i++) {
                if (freq[i] != windowfreq[i]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }
}
