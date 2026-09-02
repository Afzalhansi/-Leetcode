class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            map.put(current, map.getOrDefault(current, 0) + 1);
        }


        for(int i =0; i < nums.length; i++){
            int current = nums[i];
            int freq = map.get(current);

            if(freq == 1){
                return current;
            }
        }
       return -1;
    }
}
