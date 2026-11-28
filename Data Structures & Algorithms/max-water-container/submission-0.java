class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1;
        int max=0;
        while(left<right){
            int w=right-left;
            int h=Math.min(heights[left],heights[right]);
            int area=w*h;
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
            max=Math.max(max,area);
        }
        return max;
    }
}
