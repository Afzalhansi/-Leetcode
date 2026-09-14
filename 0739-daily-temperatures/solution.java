class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i < temperatures.length; i++){
            int current = temperatures[i];
            while(!stack.isEmpty() && current > temperatures[stack.peek()]){
                int previous = stack.pop();
                answer[previous] = i - previous;
            }
            stack.push(i);
        }
        return answer;
    }
}
