class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == k){
                count++;
                right--;
                left++;
            } else if(sum < k){
                left++;
            } else if(sum > k){
                right--;
            }
        }
        return count;
    }
}
