class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int current = 0;
        int[] answer = new int[nums.length];

        for(int i = 0; i < nums.length * 2; i++){
            int index = i % nums.length;
            current = nums[index];
            while(!stack.isEmpty() && current > nums[stack.peek()]){
                int previous = stack.pop();
                answer[previous] = current;
            }

            if(i < nums.length){
                stack.push(index);
            }
        }
        while(!stack.isEmpty()){
                int previous = stack.pop();
                answer[previous] = -1;
            }
        return answer;
    }
}
