import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] matrix = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    matrix[i][j] = S.charAt(j);
                }
            }
            Solution obj = new Solution();
            int ans = obj.MinimumExchange(matrix);
            System.out.println(ans);
        }
    }
}



class Solution
{
    public int MinimumExchange(char[][] matrix)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        char value;
        int ans=0;
        
        for(int i=0; i<n; i++){
            value='B';
            if(i%2==0){
                value='A';
            }
            
            for(int j=0; j<m; j++){
               if(matrix[i][j]!=value)
                   ans++;
               if(value=='A')
                   value='B';
               else
                   value='A';
            }
        }
       int a=matrix.length*matrix[0].length;
       return Math.min(ans,Math.abs(a-ans));
        
    }
}
