class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i: arr){
            int count = map.getOrDefault(i,0);
            map.put(i,count+1);
        }
        int[] count = new int[map.size()];
        int i =0;
        for(int j : map.values()){
            count[i++]=j;
        }
        Arrays.sort(count);
        int res=0;
        int sum=0;
        for(int j=count.length-1;j>=0;j--){
            if(sum*2>=n) break;
            sum+=count[j];
            res++;
        }
        return res;
    }
}
