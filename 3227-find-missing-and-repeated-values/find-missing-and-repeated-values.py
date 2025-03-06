class Solution(object):
    def findMissingAndRepeatedValues(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: List[int]
        """
        n=len(grid)
        ans=[0]*2
        track=[0]*(n*n)
        for i in range(n):
            for j in range(n):
                val=grid[i][j]
                track[val-1]+=1
        a=0
        b=0
        for i in range(n*n):
            if track[i]==2:
                a=i+1
            elif track[i]==0:
                b=i+1
        ans[0]=a
        ans[1]=b
                 
        return ans
    