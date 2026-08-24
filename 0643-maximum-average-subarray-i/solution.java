class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int left = 0;
        int currsum = 0;
        int maxsum = 0;

        for(int right = 0; right < k; right++){
                currsum += nums[right];
            }
        int right = k;
        maxsum = currsum;
        while(right < nums.length){
            currsum = currsum - nums[left] + nums[right];
            maxsum = Math.max(maxsum, currsum);
            left++;
            right++;
        }
        return (double) maxsum/k;
    }
}
