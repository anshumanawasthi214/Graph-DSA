public class LongestSubarraySum {
    public static void main(String[] args) {
        int arr[]={2,5,1,6,1,10,10};
        int left=0;
        int right=0;
        int target=16;
        int sum=0;
        int currlen=0;
        int n=arr.length;
      
        while(right<n){
                        sum+=arr[right];
                while(sum>target){
                   
                    sum-=arr[left];
                    left++;
                }
                if(sum<target){ 
                    currlen=Math.max(currlen,right-left+1);
                }
                right++;
                }
        System.out.print("The maximum length of the subarray is: ");
        System.out.println(currlen);
 
        }
    }    

