class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }


        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            char currentT = t.charAt(i);
            if(map1.containsKey(currentChar) && map1.get(currentChar) != currentT){
                return false;
            }

            if(map2.containsKey(currentT) && map2.get(currentT) != currentChar){
                return false;
            }

            map1.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));
        }

        return true;
    }
}