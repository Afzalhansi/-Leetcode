class Solution {

    public boolean isVowel(char c){
        c= Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    

    public String reverseVowels(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        

        while(left < right){

            if(!isVowel(chars[left])){
                left++;
            }
            else if(!isVowel(chars[right])){
                right--;
            }else{
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
