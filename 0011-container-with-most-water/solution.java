class Solution {
    public int maxArea(int[] height) {

        
		int left = 0; 
		int right = height.length - 1;
		int maxarea = 0;
		
		while(left < right) {
			int width = 0;
			int heights = 0;
			width = right - left;
			heights = Math.min(height[left], height[right]);
			int area = width * heights;
			maxarea = Math.max(maxarea, area);
			if(height[left] < height[right]) {
				left++;
			}else {
				right--;
			}
		}
    return maxarea;  
    }
}
