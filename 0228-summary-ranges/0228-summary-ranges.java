class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ls= new ArrayList<>();
         StringBuilder sb = new StringBuilder();
        if(nums.length==0)
        return ls;

        int left=0;
        int right=0;
        while(right+1<nums.length)
        {
            
            if(nums[right]+1!=nums[right+1])
            {
               
                if(right==left)
                sb.append(nums[right]);
                else
                sb.append(nums[left]).append("->").append(nums[right]);

                ls.add(sb.toString());
                sb.setLength(0);
                left=right+1;
            }

            right++;
           
        }

        if(right==left)
        sb.append(nums[right]);
        else
        sb.append(nums[left]).append("->").append(nums[right]);
        ls.add(sb.toString());
        return ls;
    }
}