class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length;
        int[] trips_cnt = new int[1001];
        for(int i =0; i<n; i++){
            trips_cnt[trips[i][1]]+=trips[i][0];
            trips_cnt[trips[i][2]]-=trips[i][0];
        }
        int cnt=0;
        for(int i = 0; i<trips_cnt.length;i++){
            if(cnt>capacity) return false;
            cnt+=trips_cnt[i];
        }
        return true;
    }
}
