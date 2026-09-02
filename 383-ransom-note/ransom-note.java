class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            char current = magazine.charAt(i);
            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        for(int i =0; i < ransomNote.length(); i++){
            char current = ransomNote.charAt(i);
            int freq = map.getOrDefault(current, 0);

            if(freq > 0){
                map.put(current, freq - 1);
            }else{
                return false;
            }
        }
      return true;  
    }
}