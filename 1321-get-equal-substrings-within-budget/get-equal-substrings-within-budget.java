class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        int left = 0;
        int currentcost = 0;
        int maxlength = 0;


        for(int right = 0; right < s.length(); right++){
            currentcost += Math.abs(s.charAt(right) - t.charAt(right));


            while(currentcost >maxCost){
                currentcost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            } 

            maxlength = Math.max(maxlength, right - left + 1); 
        }

        return maxlength;
    }
}