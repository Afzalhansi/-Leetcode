class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }

        for(int i =0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            int freq = map.get(currentChar);

            if(freq == 1){
                return i;
            }
        }
        return -1;
    }
}