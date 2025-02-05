public class SubstringContainsAllThreeCharacters{
    public static void main(String[] args) {
        String s="bbacba";
        int scount=0;
        int arr[]=new int[3];
        arr[0]=arr[1]=arr[2]=-1;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                scount+=1+Math.min(arr[0],Math.min(arr[1],arr[2]));
            }
        }
        System.out.println(scount);
    }
        
}
