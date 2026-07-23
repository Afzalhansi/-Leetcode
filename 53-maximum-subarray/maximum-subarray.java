class Solution {
    public int maxSubArray(int[] nums) {

        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];

            currentsum = Math.max(currentsum + curr, curr);
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
        }

        return maxsum;
        
    }
}