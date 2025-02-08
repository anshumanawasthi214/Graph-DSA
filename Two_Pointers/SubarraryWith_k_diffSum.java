import java.util.*;

public class SubarraryWith_k_diffSum {
    public static int helper(int arr[],int k){
       HashMap<Integer,Integer> hmap=new HashMap<>();
       int left=0;
       int right=0;
       int count=0;
       while (right<arr.length) {
           hmap.put(arr[right],hmap.getOrDefault(arr[right],0)+1);
           
           while(hmap.size()>k){
                if(hmap.get(arr[left])==1){
                    hmap.remove(arr[left]);
                } 
                else{
                    hmap.put(arr[left],hmap.get(arr[left])-1);
                }
               
                left++;
               
            }
            count+=right-left+1;
            right++;
           }
           return count;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4};
        int k=3;
        
        System.out.println(helper(arr, k)-helper(arr, k-1));
}
}
