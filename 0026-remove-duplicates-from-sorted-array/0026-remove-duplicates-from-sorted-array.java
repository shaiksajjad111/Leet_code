class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int j=1;
        int res[]=new int[nums.length];
        Arrays.fill(res,-999);
        res[0]=nums[0];
        for(int x:nums){
            count=0;
            for(int i=0;i<nums.length;i++){
                if(x==res[i]){
                    count++;
                }
            }
            if(count==0){
                res[j]=x;
                j++;
            }
        }
        int z=1;
        Arrays.fill(nums,-999);
        nums[0]=res[0];
        count=1;
        for(int x=1;x<res.length;x++){
            if(res[x]!=-999){
                nums[z]=res[x];
                z++;
                count++;
            }
        }
        return count;
        
    }
}