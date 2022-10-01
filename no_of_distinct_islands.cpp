#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  private:
    void dfs(vector<vector<int>> & grid, int r, int c, int n, int m, int pr, int pc, vector<pair<int, int>>&path)
    {
        if(r < 0 || c < 0 || r >= n || c >= m || !grid[r][c])
        return;
        grid[r][c] = 0;
        path.push_back({pr - r, pc - c});
        dfs(grid, r, c + 1, n, m, pr, pc, path); //right
        dfs(grid, r, c - 1, n, m, pr, pc, path); //left
        dfs(grid, r - 1, c, n, m, pr, pc, path); //up
        dfs(grid, r + 1, c, n, m, pr, pc, path); //down
    }    
  public:
    int countDistinctIslands(vector<vector<int>>& grid) {
        // code here
        int n = grid.size();
        int m = grid[0].size();
        set<vector<pair<int, int>>>st;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j])
                {
                vector<pair<int, int>> path;
                dfs(grid, i, j, n, m, i, j, path);
                st.insert(path);
                }
            }
        }
        return st.size();
    }
};

int main() {

    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        vector<vector<int>> grid(n, vector<int>(m));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> grid[i][j];
            }
        }
        Solution obj;
        cout << obj.countDistinctIslands(grid) << endl;
    }
}
