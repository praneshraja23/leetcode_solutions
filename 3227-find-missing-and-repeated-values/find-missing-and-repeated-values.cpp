class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        int n=grid.size();
        vector<int> ans;
        vector<int> track(n*n, 0);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int val=grid[i][j];
                track[val-1]+=1;
            }
        }
        int a=0,b=0;
        for(int i=0;i<n*n;i++)
        {
            if(track[i]==2)
            {
                a=i+1;
            }
            else if(track[i]==0)
            {
               b=i+1;
            }
        }
        ans.push_back(a);
        ans.push_back(b);
                 
        return ans;
    }
};