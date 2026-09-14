class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int count = 0;
        int currentSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int needed = 0;
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];

            needed = currentSum - goal;

            if(map.containsKey(needed)){
                count += map.get(needed);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}
