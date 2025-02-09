import java.util.*;

public class MinimumWindowSubstring {

    // -------This problem is not solved completely
    public static void main(String[] args) {
        // String s="ddabbca";
        // String t="abc";
        // int min=Integer.MAX_VALUE;
        // int left=0;
        //     int right=0;
        //     int sidx=-1;
        // HashMap<Character,Integer>hmap=new HashMap<>();
        // for(int i=0;i<t.length();i++){
        //     hmap.put(t.charAt(i),hmap.getOrDefault(t.charAt(i),0)+1);
        // }int count=0;
        // while(right<s.length()){
            
        //     if(hmap.containsKey(s.charAt(right))&& hmap.get(s.charAt(right))>0){
        //         count++;
        //     }
        //     hmap.put(s.charAt(right),hmap.getOrDefault(s.charAt(right),0)-1);
           
            
        //     while(count==t.length()){
        //        if(right-left+1<min)min=right-left+1;
        //         sidx=left;
        //         hmap.put(s.charAt(left),hmap.get(s.charAt(left))+1);
        //         if(hmap.get(s.charAt(left))>0){
        //            count--;
                    
        //         }
        //         left++;
        //         }
        //         right++; 

        // }
       StringBuilder x=new StringBuilder();
        // for(int i=sidx;i<sidx+min;i++){
        //     x.append(s.charAt(i));
        // }
        System.out.println(x);
    }
}
       

