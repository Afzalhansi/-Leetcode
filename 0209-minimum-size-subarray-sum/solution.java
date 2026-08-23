class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int right = 0;
        int currsum = 0;
        int minLength = Integer.MAX_VALUE;

        while(right < nums.length){
            currsum = currsum + nums[right];

            while(currsum >= target){
                minLength = Math.min(minLength, right - left + 1);
                currsum -= nums[left]; 
                left++;
            }  
            right++;
        }

        if (minLength == Integer.MAX_VALUE){
            return 0;
        }else{
            return minLength;
        }
    }
}
