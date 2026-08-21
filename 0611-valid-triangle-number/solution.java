class Solution {
    public int triangleNumber(int[] nums) {

        Arrays.sort(nums);

        int count = 0;

        for(int right = 2; right < nums.length ; right++){

            int left = 0;
            int mid = right - 1;
            
            while(left < mid){

                if(nums[left] + nums[mid] > nums[right]){
                    count += mid - left;
                    mid--;
                }else if(nums[left] + nums[mid] <= nums[right]){
                    left++;
                }
            }
        }
        return count;
    }
}
