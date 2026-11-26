class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int current =0;
        int start=0;
        int diff=0;
        for(int i=0;i<gas.length;i++){
            diff=gas[i]-cost[i];
            total = total+diff;
            current=current+diff;
            if(current<0){
                current=0;
                start=i+1;
            }
        }
        if(total<0){
            return -1;
        }
        else{
            return start;
        }

    }
}