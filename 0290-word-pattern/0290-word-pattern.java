class Solution {
    public boolean wordPattern(String pattern, String s) {
      String[] arr=s.split(" ");
      if(arr.length!=pattern.length()){
        return false;
      }
      HashMap<Character,String> map=new HashMap<>();
      for(int i=0;i<pattern.length();i++){
        char c1=pattern.charAt(i);
        String s1=arr[i];
        if(map.containsKey(c1)){
            if(!map.get(c1).equals(s1)){
                return false;
            }
        }else{
            if(map.containsValue(s1)){
                return false;
            }
            map.put(c1,s1);
        }
      }
      return true;  
    }
}