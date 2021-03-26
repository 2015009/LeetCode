class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] res = new int[n];
        int d=0;
        for(int i=0; i<n; i++){
            if(seq.charAt(i)=='('){
                d++;
                res[i]=d%2;
            }else{
                res[i]=d%2;
                d--;
            }
        }
        return res;

    }
}
