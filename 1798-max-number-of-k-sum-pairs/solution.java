class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int left = 0;
        int right = nums.length - 1;
        int sum =0;

        while(left < right){

            sum = nums[left] + nums[right];
            if(sum == k){
                count++;
                left++;
                right--;
            }else if(sum > k){
                right--;
            }else{
                left++;
            }
        }
        return count;
    }
}
