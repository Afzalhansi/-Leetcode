class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[nums1.length];
        int current = 0;

        for(int i =0; i < nums2.length; i++){
            current = nums2[i];
            while(!stack.isEmpty() && current > nums2[stack.peek()]){
                int previous = stack.pop();
                map.put(nums2[previous],current);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
                int previous = stack.pop();
                map.put(nums2[previous], -1);
        }

        for(int i =0; i < nums1.length; i++){
            current = nums1[i];
            answer[i] = map.get(current);
        } 
        return answer;
    }
}
