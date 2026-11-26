class Solution {
    public int maxArea(int[] height) {
        int r=height.length-1;
        int l=0;
        int max=0;
        while(l<r){
            int max1=Math.min(height[l],height[r])*(r-l);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
            max=Math.max(max,max1);
        }
        return max;
    }
}