class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        Map<Integer,Integer> end = new HashMap<Integer,Integer>();

        for(int x:nums){
            int temp = count.getOrDefault(x,0);
            count.put(x,temp+1);
        }
        for(int x:nums){

            int cur  = count.getOrDefault(x,0);
            if(cur>0){
                int preCount = end.getOrDefault(x-1,0);
                if(preCount>0){
                    
                    int new_end1=end.getOrDefault(x-1,0);
                    int new_end2=end.getOrDefault(x,0);
                    count.put(x,cur-1);
                    end.put(x-1,new_end1-1);
                    end.put(x,new_end2+1);
                }else{
                    int count_1 = count.getOrDefault(x+1,0);
                    int count_2 = count.getOrDefault(x+2,0);
                    if(count_1>0&&count_2>0){
                        
                        int new_end3 = end.getOrDefault(x+2,0);
                        count.put(x,cur-1);
                        count.put(x+1,count_1-1);
                        count.put(x+2,count_2-1);
                        end.put(x+2,new_end3+1);

                   }else{
                      return false;
                }
              }            
            }
        }
        
        return true;
    }
}
