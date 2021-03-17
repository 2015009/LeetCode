class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        if not points:
            return 0
        points.sort(key=lambda x:x[1])

        res = 1
        cur = points[0][1]

        for ball in points:
            if ball[0]<=cur:
                continue
            else:
                res+=1
                cur = ball[1]
        
        return res
