import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String string=new String("cadbzabcd");
        int left=0,right=0,max=0;
        HashMap<Character,Integer> hmap=new HashMap<>();
        while(right<string.length()){
            if(hmap.containsKey(string.charAt(right))){
                left=Math.max(left,hmap.get(string.charAt(right))+1);
            }
            hmap.put(string.charAt(right),right);
            max=Math.max(max, right-left+1);
            right++;
        }
        System.out.print("Max substring size is :"+max);

    }
}
