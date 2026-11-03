class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;
        int max = 0;
        int current = 0;
        while (right < k) {
            char ch = s.charAt(right);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                current++;
            }
            right++;
        }
        max = current;
        while(right < s.length()){
            char outgoing = s.charAt(left);
            if (outgoing == 'a' || outgoing == 'e' || outgoing == 'i' ||
                outgoing == 'o' || outgoing == 'u') {
                current--;
            }
            char incoming = s.charAt(right);
            if (incoming == 'a' || incoming == 'e' || incoming == 'i' ||
                incoming == 'o' || incoming == 'u') {
                current++;
            }
            max = Math.max(max, current);
            left++;
            right++;
        }
        return max;
    }
}
