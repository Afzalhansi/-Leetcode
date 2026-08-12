class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        String s1 = s.toLowerCase();
       
        while(left < right){  
            
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
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
