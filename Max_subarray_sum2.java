public class Max_subarray_sum2 {
    public static int subarray(int a[],int sum[]){
        int max=Integer.MIN_VALUE;

            for(int i=0;i<a.length;i++){
                int add=0;
                for(int j=i;j<a.length;j++){
                    add= i==0?sum[j]:sum[j]-sum[i-1];
                }
                if(add>max){
                    max=add;
                }
                

            }
            return max;
    
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int sum[]=new int[a.length];
        sum[0]=a[0];
        for(int i=1;i<a.length;i++){
            sum[i]=a[i]+sum[i-1];


        }
       
        System.out.println(subarray(a,sum));
    }
}
