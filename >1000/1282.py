class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        l = len(groupSizes)
        res = []
        temp = []
        for i in range(l+1):
            temp.append([])
        for i in range(l):
            temp[groupSizes[i]].append(i)
            if len(temp[groupSizes[i]])==groupSizes[i]:
                res.append(temp[groupSizes[i]])
                temp[groupSizes[i]]=[]
        
        return res
