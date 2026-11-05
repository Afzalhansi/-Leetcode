class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        int right =0;
        double currentSum =0;
        double maxSum =0;

        while(right < k){
            currentSum +=nums[right];
            right++;
        }

        maxSum = currentSum;
        
        while(right < nums.length){
            currentSum -= nums[left];

            currentSum += nums[right];

            maxSum = Math.max(maxSum, currentSum);

            left++;
            right++;
        }

       return (double) maxSum / k; 
    }
}