// { Driver Code Starts
//Initial Template for JAVA

import java.io.*;
//import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S1 = read.readLine();
            String S2 = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.findTime(S1,S2));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
     int findTime(String S1 , String S2) {
        int time=0;
        int pos=0;
        for (int i=0; i<S2.length();i++){
            int at= S1.indexOf(S2.charAt(i));
            time=time+Math.abs(at-pos);
            pos=at;
        }
        return time;
    }
};