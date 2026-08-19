class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int start = 0;
        int count = 0;
        int right = 0;
    
    while(start < chars.length){


        while(i < chars.length && chars[i] == chars[start]){
            i++;
        }

            count = i - start;
            chars[right] = chars[start];
            right++;

            if (count > 1) {

                String countString = String.valueOf(count);

                int k = 0;

                while (k < countString.length()) {
                    chars[right] = countString.charAt(k);
                    k++;
                    right++;
                }
            }
            start = i;
        }
       return right;
    }
}
