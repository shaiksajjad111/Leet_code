class Solution {
    public int majorityElement(int[] nums) {
        int count;
        int n=nums.length;
        int k=0;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
            }
            res[i]=count;
            if(res[i]>=(n/2)){
                k=nums[i];
                break;
            }
        }
        
    return k;
    }
}