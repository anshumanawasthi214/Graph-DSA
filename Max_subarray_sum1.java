public class Max_subarray_sum1{

    public static int subarray_sum(int a[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            
            for(int j=i;j<a.length;j++){
                int sum=0;
                    for(int k=i;k<=j;k++){
                        System.out.print(a[k]+" ");
                        sum+=a[k];
                    }
                    System.out.println();
                    if(sum>max){
                        max=sum;
                        System.out.println("max is :"+max);
                    }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        System.out.println("max sum of subarray is :"+subarray_sum(a));
    }
}