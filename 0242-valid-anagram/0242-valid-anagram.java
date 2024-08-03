class Solution {
public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    boolean res=true;
        HashMap<Character, Integer> HP=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(HP.containsKey(s.charAt(i))){
                HP.put(s.charAt(i),HP.get(s.charAt(i))+1);
            }
            else{
                HP.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(HP.containsKey(c)&&HP.get(c)!=0){
                HP.put(c,HP.get(c)-1);
            }else{
                return false;
            }
        }

        return res;


    }
};