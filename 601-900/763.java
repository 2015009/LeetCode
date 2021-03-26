class Solution {
    public List<Integer> partitionLabels(String S) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<S.length(); i++){            
            map.put(S.charAt(i),i);
        }
        List<Integer> res = new LinkedList();
        int start=0,end=0;
        for(int i=0;i<S.length();i++){
            end = Math.max(map.get(S.charAt(i)),end);
            if(i==end){
                res.add(end-start+1);
                start = end+1;
            }
        }   
        


        return res;
    }
}
