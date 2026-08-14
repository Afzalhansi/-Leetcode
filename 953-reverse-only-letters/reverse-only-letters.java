class Solution {
    public String reverseOnlyLetters(String s) {
        
        int left = 0;
        int right = s.length() - 1;

        char[] chars = s.toCharArray();


        while(left < right){

            if(!Character.isLetter(s.charAt(left))){
                left++;
                continue;
            }

            if(!Character.isLetter(s.charAt(right))){
                right--;
                continue;
            }

            if(Character.isLetter(s.charAt(left)) && Character.isLetter(s.charAt(right))){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }

        }
        return new String(chars);
    }
}