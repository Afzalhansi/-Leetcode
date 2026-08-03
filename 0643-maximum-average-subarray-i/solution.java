class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
       int maxsum = Integer.MIN_VALUE;
       int left = 0;
       int currsum = 0;

       for(int right =0; right < nums.length; right++){
            currsum += nums[right];
            if(right - left + 1 == k){
                maxsum = Math.max(maxsum, currsum);
                currsum -= nums[left];
                left++;
            }
       }
    return (double) maxsum / k;
    }
}
