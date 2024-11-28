public class Kadane_algorithm{
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            
            cs+=a[i];
            if(cs<0){
                cs=0;
            }
           ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }
}