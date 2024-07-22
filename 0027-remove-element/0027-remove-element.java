class Solution {
    public int removeElement(int[] nums, int val) {
        //int[] res=new int[nums.length];
        int i=0;
        int c=0;
        for(int x:nums){
            if(x!=val){
                nums[i]=x;
                i++;
                c++;
            }
        }
        return c;
    }
}