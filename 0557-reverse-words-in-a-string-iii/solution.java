class Solution {
    public String reverseWords(String s) {

        char[] chars = s.toCharArray();

        int start = 0;

        for (int i = 0; i <= chars.length; i++) {

            // Word ended
            if (i == chars.length || chars[i] == ' ') {

                int left = start;
                int right = i - 1;

                // Reverse current word
                while (left < right) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;

                    left++;
                    right--;
                }

                // Start of next word
                start = i + 1;
            }
        }

        return new String(chars);
    }
}
