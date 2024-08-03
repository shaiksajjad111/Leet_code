class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length){
        return false;
    }
    boolean res=true;
        HashMap<Integer, Integer> HP=new HashMap<Integer, Integer>();
        for(int i=0;i<target.length;i++){
            if(HP.containsKey(target[i])){
                HP.put(target[i],HP.get(target[i])+1);
            }
            else{
                HP.put(target[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            int c=arr[i];
            if(HP.containsKey(c)&&HP.get(c)!=0){
                HP.put(c,HP.get(c)-1);
            }else{
                return false;
            }
        }

        return res; 
    }
}