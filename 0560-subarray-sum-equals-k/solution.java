class Solution {
    public int subarraySum(int[] nums, int k) {

        int currentSum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        int needed = 0;

        for(int i =0; i < nums.length; i++){
            currentSum += nums[i];

            needed = currentSum - k;

            if(map.containsKey(needed)){
                count += map.get(needed);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}
