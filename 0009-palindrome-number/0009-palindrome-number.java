class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String res=Integer.toString(x);
        for(int i=0;i<res.length();i++){
        char c=res.charAt(i);
        char d=res.charAt(res.length()-1-i);
        if(c!=d){
            return false;
        }
        }        
        return true;
    }
}