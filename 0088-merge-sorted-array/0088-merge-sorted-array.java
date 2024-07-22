class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            Arrays.sort(nums1);
        }
        else{
            int i=0;
         for(int x:nums1){
            if(x!=0){
                nums1[i]=x;
                i++;
            }
        }
        for(int x:nums2){
            if(x!=0){
                nums1[i]=x;
                i++;
            }
        }
        Arrays.sort(nums1);
        }
        
    }
};
