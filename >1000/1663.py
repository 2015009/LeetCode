class Solution:
    def getSmallestString(self, n: int, k: int) -> str:
        res=[]
        for i in range(n,0,-1):
            bound = k-(i-1)*26
            if bound<1:
                res.append('a')
                k=k-1;
            else:
                res.append(chr(bound+96))
                k=k-bound
        
        return ''.join(res)
