class Solution {
    public String longestPalindrome(String s) {
        
        if(s==null || s.length() < 2){
            return s;
        }

        int n = s.length();
        int start = 0;
        int maxlength = 1;

        for(int i=0; i < n; i++){
            int left = i;
            int right=i;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                int curr = right - left + 1;

                if(curr > maxlength){
                    maxlength = curr;
                    start = left;
                }

                left--;
                right++;
            }


            left = i;
            right=i + 1;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                int curr = right - left + 1;

                if(curr > maxlength){
                    maxlength = curr;
                    start = left;
                }

                left--;
                right++;
            }
        }

        return s.substring(start, start + maxlength);
    }
}
