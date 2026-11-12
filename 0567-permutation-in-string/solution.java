class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int left =0;
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        if(s1.length() > s2.length()){
            return false;
        }

        for(int i =0; i <s1.length(); i++){
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
            windowMap.put(s2.charAt(i), windowMap.getOrDefault(s2.charAt(i), 0) + 1);

        }
        if (s1Map.equals(windowMap)) {
            return true;
        }
        for (int right = s1.length(); right < s2.length(); right++) {
            char outgoing = s2.charAt(left);

            windowMap.put(outgoing, windowMap.get(outgoing) - 1);
            if (windowMap.get(outgoing) == 0) {
                windowMap.remove(outgoing);
            }
            left++;
            char incoming = s2.charAt(right);
            windowMap.put(incoming,windowMap.getOrDefault(incoming, 0) + 1);

            if(s1Map.equals(windowMap)){
                return true;
            }

        }
        return false;
    }
}
