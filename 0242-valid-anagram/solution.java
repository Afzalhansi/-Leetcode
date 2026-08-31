class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        
        for(int i =0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            char currentChar = t.charAt(i);
            if(map.containsKey(currentChar) && map.get(currentChar) > 0){
                map.put(currentChar,map.get(currentChar) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}
