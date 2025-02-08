public class BinarySubarraySum {

    public static int helper(int[] arr,int goal){
      
        int left=0;
        int right=0;
        int cnt=0;
        int sum=0;
        if(goal<0){
            return 0;
        }
        while(right<arr.length){ 
                    sum+=arr[right];
                    while(sum>goal){
                        sum-=arr[left];
                        left++;
                    }
                    cnt+=(right-left+1);
                    right++;
                }
                return cnt;
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1};
        int goal=2;
      int result=helper(arr,goal)-helper(arr,goal-1);
        System.out.println(result);
    }
}
