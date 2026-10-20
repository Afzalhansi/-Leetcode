class Solution {
    public int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while(read < chars.length){
            int count = 1;
            while (read < chars.length - 1 && chars[read] == chars[read + 1]) {
                read++;
                count++;
            }
            chars[write] = chars[read];
            write++; 
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[write] = digit;
                    write++;
                }
            }  
            read++;
        }
    return write; 
    }
}