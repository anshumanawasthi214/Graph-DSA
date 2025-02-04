import java.util.*;

public class LongestSubstringWithDistinctCharacters{
    public static void main(String[] args) {
        String str="aaabbccd";
        int left=0;
        int right=0;
        int maxlen=0;
        int k=2;
        HashMap<Character,Integer> hmap=new HashMap<>();
        while(right<str.length()){
                hmap.put(str.charAt(right),hmap.getOrDefault(str.charAt(right),0)+1);
                if(hmap.size()>k){
                        hmap.put(str.charAt(left),hmap.get(str.charAt(left))-01);
                        if(hmap.get(str.charAt(left))==0){
                            hmap.remove(str.charAt(left));
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