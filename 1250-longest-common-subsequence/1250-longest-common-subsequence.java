class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return lcs(m,n,text1,text2,dp);
        
        }
        private int lcs(int m,int n,String a,String b,int[][] dp){
            if(m==0||n==0){
                return 0;
            }
            if(dp[m][n]!=-1){
                return dp[m][n];
            }
            if(a.charAt(m-1)==b.charAt(n-1)){
                dp[m][n]=1+lcs(m-1,n-1,a,b,dp);;
                return dp[m][n];
            }
            else{
                dp[m][n]=Math.max(lcs(m,n-1,a,b,dp),lcs(m-1,n,a,b,dp));
                return dp[m][n];
            }
        }
}