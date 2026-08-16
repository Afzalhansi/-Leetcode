class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int leftsquare = 0;
        int rightsquare = 0;
        int index = nums.length - 1;

        while(left <= right){
            leftsquare = nums[left] * nums[left];
            rightsquare = nums[right] * nums[right];
            if(leftsquare > rightsquare){
                result[index] = leftsquare;
                left++;
            }else{
                result[index] = rightsquare;
                right--;
            }
            index--;
        }
    return result;
    }
}
