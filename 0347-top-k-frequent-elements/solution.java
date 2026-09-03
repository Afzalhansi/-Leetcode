class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[k];

        for(int i =0; i < nums.length; i++){
            int current = nums[i];
            map.put(current, map.getOrDefault(current, 0)+ 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        
        for (int number : map.keySet()) {
            pq.add(number);
        }
        int i = 0;
        while(i < k){
            answer[i] = pq.poll();
            i++;
        }
    
        return answer;
    }
}
