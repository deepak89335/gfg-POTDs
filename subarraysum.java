/*Given an array containing N integers and a positive integer K, find the length of the longest sub array with sum 
of the elements divisible by the given value K.*/
import java.util.HashMap;
import java.util.Scanner;

public class subarraysum {

    public static int solution(int[] a, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans=0;
        int sum=0;
        int rem=0;
        map.put(0, -1);
        for(int i=0; i<a.length; i++){
            sum+=a[i];
            rem=sum % k;
            //if remainder is negative then we will normalize it by adding k
            if (rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                int idx=map.get(rem);
                int len=i-idx;
                if(len> ans){
                    ans=len;
                }
                
            }
            else{
                
                map.put(rem,i);
            }
            
        }
        return ans;
    }
 



    public static void main(String[] args) {
        
        //Scanner scn = new Scanner(System.in);
        try(Scanner scn = new Scanner(System.in)){
            //rest of your code
        
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solution(arr, k));
    }
}

}