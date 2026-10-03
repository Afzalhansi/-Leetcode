class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = 0;

        for (int num : nums) {
            right = Math.max(right, num);
        }
        
        while(left <= right){
            int mid = left +(right - left)/2;
            long sum = 0;
            for (int num : nums) {
                sum += (num + (long) mid - 1) / mid;
            }
            if(sum <= threshold){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}