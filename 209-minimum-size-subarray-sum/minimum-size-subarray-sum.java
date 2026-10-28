class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        for(int right =0; right <= nums.length - 1; right++){
            sum += nums[right];
            while(sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }
}