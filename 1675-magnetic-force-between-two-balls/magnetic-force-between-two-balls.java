class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int left = 1;
        int right = position[position.length - 1] - position[0];

        while(left <= right){

            int mid = left + (right - left)/2;
            int balls = 1;
            int lastPosition = position[0];

            for(int i=1; i < position.length; i++){
                if(position[i] - lastPosition >= mid){
                    balls++;
                lastPosition = position[i];
                }
            }
            if(balls >= m){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return right;
    }
}