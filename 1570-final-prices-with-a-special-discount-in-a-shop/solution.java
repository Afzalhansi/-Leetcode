class Solution {
    public int[] finalPrices(int[] prices) {
        
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        int current = 0;


        for(int i =prices.length - 1; i >= 0; i--){
            current = prices[i];
            while(!stack.isEmpty() && current < stack.peek()){
                stack.pop();
            }

            if(!stack.isEmpty()){
                answer[i] = current - stack.peek();
            }else{
                answer[i] = prices[i];
            }
            stack.push(current);
        }
        return answer;
    }
}
