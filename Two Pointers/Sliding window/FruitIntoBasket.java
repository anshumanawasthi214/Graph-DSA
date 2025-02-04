import java.util.*;

public class FruitIntoBasket {
    public static void main(String[] args) {
        int values[]={3,3,3,1,3,1,1,1,2,3,3,4};
        int maxlen=0;

        // Bruteforce approach

        // for(int i=0;i<values.length;i++){
        //         Set<Integer> s=new HashSet<>();
        //         for(int j=i;j<values.length;j++){
        //             s.add(values[j]);
        //             if(s.size()<=2){
        //                 maxlen=Math.max(maxlen,j-i+1);
        //             }
        //             else{
        //                 break;
        //             }
        //         }       
        // }
        // System.out.println(maxlen);



        // Optimize approach

        HashMap<Integer,Integer> hmap=new HashMap<>();
        int left=0;
        int right=0;
        // while(right<values.length){
        //     hmap.put(values[right],hmap.getOrDefault(values[right], 0)+1);
        //    if(hmap.size()>2){
        //         while(hmap.size()>2){
        //             hmap.put(values[left],hmap.get(values[left])-1);
        //             if(hmap.get(values[left])==0){
        //                 hmap.remove(values[left]);
        //             }
        //             left++;
        //         }

        //    }
        //    if(hmap.size()<=2){
        //     maxlen=Math.max(maxlen, right-left+1);
        //    }
        //    right++;
        // }
        // System.out.println(maxlen);
        


        //more optimized solution

        while(right<values.length){
            hmap.put(values[right],hmap.getOrDefault(values[right],0)+1);
            if(hmap.size()>2){
                    hmap.put(values[left],hmap.get(values[left])-1);
                    
                    if(hmap.get(values[left])==0){
                        hmap.remove(values[left]);
                    }
                    left++;

            }
            if(hmap.size()<=2){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
            
        }
        System.out.println(maxlen);
    }
}

