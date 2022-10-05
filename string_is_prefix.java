import java.io.*;
import java.util.*;
class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String li[] = new String[N];
            for(int i=0; i<N; i++)
                li[i] = in.readLine();
            int Q = Integer.parseInt(in.readLine());
            String query[] = new String[Q];
            for(int i=0; i<Q; i++)
                query[i] = in.readLine();
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.prefixCount(N, Q, li, query);
            for(int i = 0;i < ans.size();i++)
                System.out.println(ans.get(i));
        }
    }
}



class Solution{
    static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
       List<Integer> ans = new ArrayList<>();
        HashMap<String , Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++){
            String str = "";
            for(int j=0;j<li[i].length();j++){
                str += li[i].charAt(j);
                hm.put(str , hm.getOrDefault(str , 0)+1);    
            }
        }
        for(String s : query){
            ans.add(hm.getOrDefault(s , 0));
        }
        return ans;
    
    }
}
