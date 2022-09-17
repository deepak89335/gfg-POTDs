// { Driver Code Starts
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    
    class Array
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
           /* int t = Integer.parseInt(read.readLine());
            
            while(t-- > 0)
            {*/
                int n = Integer.parseInt(read.readLine());
                String st[] = read.readLine().trim().split("\\s+");
                
                int arr[] = new int[n];
                
                for(int i = 0; i < n; i++)
                  arr[i] = Integer.parseInt(st[i]);
                  
                System.out.println(new Solutionn().minNumber(arr,0,n-1));
            //}
        }
        
    }// } Driver Code Ends
    
    
    
    
    class Solutionn
    {
        //Function to find the minimum element in sorted and rotated array.
        int minNumber(int arr[], int low, int high)
        {
            int lo=0;
            int hi=arr.length-1;
            if(arr[lo]<=arr[hi]){
                //array is not rotated or is rotated n times, the it must be sorted
                return arr[0];
            }
            while(lo <= hi){
                int mid=(lo+hi)/2;
                
                if(arr[mid]>arr[mid+1]){
                    return arr[mid+1];
                }
                else if(arr[mid]<arr[mid-1]){
                    return arr[mid];
                }
                else if(arr[lo]<=arr[mid]){
                    lo=mid+1;
                }
                else if(arr[mid]<=arr[hi]){
                    hi=mid-1;
                }
                
            }
            return -1;
        }
    }