public class MaxCardFromList {
    public static void main(String[] args) {
        int arr[]={3,2,7,2,1,7,7};
        int k=4;
        int left=0;
        int right=0;
        int n=arr.length;
       for(int i=0;i<k;i++){
        left+=arr[i];
       }
       int maxSum=left;
       int i=0;
      while(k!=0){
        left-=arr[k-1];
        right+=arr[n-1-i];
        maxSum=Math.max(maxSum,left+right);
        i++;
        k--;
      }
      System.out.println(maxSum);
    }
}
