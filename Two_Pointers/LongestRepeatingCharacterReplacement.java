import java.util.*;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s="AABABBA";
        int maxlen=0;
        int k=2;
        // for(int i=0;i<s.length();i++){
        //     HashMap<Character,Integer> hmap=new HashMap<>();

        //     int maxfreq=0;
        //     for(int j=i;j<s.length();j++){
        //         hmap.put(s.charAt(j),hmap.getOrDefault(s.charAt(j),0)+1);
        //         maxfreq=Math.max(maxfreq,hmap.get(s.charAt(j)));
        //         int changes=(j-i+1)-maxfreq;
        //         if(changes<=k){
        //             maxlen=Math.max(maxlen,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // System.out.println(maxlen);
        


        //optimized code

        int left=0;
        int right=0;
        int maxfreq=0;
        HashMap<Character,Integer> hmap=new HashMap<>(26);
        while(right<s.length()){
          
          
            hmap.put(s.charAt(right),hmap.getOrDefault(s.charAt(right), 0)+1);
             maxfreq=Math.max(maxfreq,hmap.get(s.charAt(right)));
                if(right-left+1-maxfreq>k){
                    hmap.put(s.charAt(left),hmap.get(s.charAt(left))-1);
                    left++;
                }
                if(right-left+1-maxfreq<=k)
                    maxlen=Math.max(maxlen,right-left+1);
                
             right++;

        }
        System.out.println(maxlen);
    }
}
