class Solution {

    public long countPair(int[] nums,  int x){
        int left = 0;
        int right = nums.length - 1;
        long count = 0;

        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum > x){
                right--;
            }else if(sum <= x){
                count +=right - left;
                left++;
            }
        }
        return count;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        long upperCount = countPair(nums,upper);
        long lowerCount = countPair(nums, lower - 1);
        return upperCount - lowerCount;
    }
}
