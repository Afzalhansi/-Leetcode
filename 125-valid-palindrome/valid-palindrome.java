class Solution {
    public boolean isPalindrome(String s) {

       int left = 0;
       int right = s.length() - 1;
       String s1 = s.toLowerCase();

    while(left < right){

            while(right >=0 && !Character.isLetterOrDigit(s1.charAt(right))){
                right--;
            }

            while(left < s1.length() && !Character.isLetterOrDigit(s1.charAt(left))){
                left++;
            }

            if (left >= right) {
                return true;
            }

            if(s1.charAt(left) != s1.charAt(right)){
                return false; 
            }   
            left++;
            right--; 
        }
        return true;
    }
}