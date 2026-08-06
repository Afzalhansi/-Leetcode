class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int left = 0;
        int extra = 0;
        int baseSatisfied = 0;
        int maxExtra = 0;


        for(int right = 0; right < grumpy.length; right++){

             if(grumpy[right] == 0){
                baseSatisfied += customers[right]; 
            }
            if(grumpy[right] == 1){
                extra += customers[right];
            }
            if(right - left + 1 == minutes){
                maxExtra = Math.max(maxExtra, extra);
                if(grumpy[left] == 1){
                    extra -= customers[left];
                }
                left++;
            }    
        }
        return baseSatisfied + maxExtra;
    }
}