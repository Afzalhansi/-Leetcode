class Solution {
    public int splitArray(int[] nums, int k) {
        

        int left = 0;
        int right = 0;

        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while(left <= right){
            int mid = left + (right - left)/ 2;
            int currentSum=0;
            int subArrayUsed = 1;

            for(int num : nums){
                if(currentSum + num > mid){
                    subArrayUsed++;
                    currentSum = num;
                }else {
                    currentSum +=num;
                }
            }
            if(subArrayUsed <= k){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
