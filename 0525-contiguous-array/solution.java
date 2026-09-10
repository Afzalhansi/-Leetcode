class Solution {
    public int findMaxLength(int[] nums) {

        int currentSum = 0;
        int maxLength = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                currentSum--;
            }

            if(nums[i] == 1){
                currentSum++;
            }

            if(map.containsKey(currentSum)){
                int length = i - map.get(currentSum);
                maxLength = Math.max(maxLength, length);
            }else{
                map.put(currentSum, i);
            }
        }
        return maxLength;
    }
}
