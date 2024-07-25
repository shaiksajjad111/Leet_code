class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int farthest = 0;

        for (int i = 0; i < n; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= n - 1) {
                return true;
            }
        }

        return false;
    }
}
