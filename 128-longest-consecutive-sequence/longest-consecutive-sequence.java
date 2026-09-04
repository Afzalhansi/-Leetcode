class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int current;
        int length;
        int longest = 0;

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int x : set){
            if(!set.contains(x - 1)){
                current = x;
                length = 1;
                while(set.contains(current + 1)){
                    current++;
                    length++;
                }

                if(length > longest){
                    longest = length;
                }
            }
        }  
        return longest;      
    }
}