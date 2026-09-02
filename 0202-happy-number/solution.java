class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        int digit = 0;
        int current = n;

        while(true){
            if(current == 1){
                return true;
            }else if(set.contains(current)){
                return false;
            }
        set.add(current);
        int temp = current;
        int sum = 0;

        while(temp > 0){
            digit = temp % 10;
            sum = sum + (digit*digit);
            temp = temp /10;
        }
        current = sum; 
      }  
    }
}
