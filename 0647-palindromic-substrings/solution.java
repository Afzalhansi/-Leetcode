class Solution {
    public int countSubstrings(String s) {
        int left;
        int right;
        int count = 0;

        for(int i =0; i< s.length(); i++){

            left = i;
            right = i;
            while(left >= 0 && right <s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                right++;
                left--;
            }

            left = i;
            right = i + 1;
            while(left >= 0 && right <s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                right++;
                left--;
            }

        }
    return count;  
    }
}
