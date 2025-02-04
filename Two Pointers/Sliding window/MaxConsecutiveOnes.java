public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        // 
        //  - Bruteforce appr.
        int k=2;                                                       
        int maxlen=0;                                                
       /*  for(int i=0;i<values.length;i++){                            
            int zeros=0;                                             
            for(int j=i;j<values.length;j++){                        
                if(values[j]==0){                                    
                    zeros++;                                             
                }                                                    
                if(zeros<=k){                                        
                    maxlen=Math.max(maxlen,j-i+1);                   
                }        
                  else{       
                           break;  
                    }                                                    
            }                                                        
            

        }
        System.out.println(maxlen);
        */
        
        // Another approach 

        int left=0;
        int right=0;
        int zeroes=0;
        // while(right<values.length){
        //     if(values[right]==0){
        //         zeroes++;
        //     }
        //     while(zeroes>k){
        //         if(values[left]==0){
        //             zeroes--;
                   
        //         }
        //         left++;
        //     }
        //     if(zeroes<=k){
        //         maxlen=Math.max(maxlen,right-left+1);
        //     }
        //     right++;
        // }
        // System.out.println(maxlen);


        // Optimized approach
        int values[]={1,1,1,0,0,1,0,0,0,1,1,1,0};
        while(right<values.length){
            if(values[right]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(values[left]==0){
                    zeroes--;
                }
                left++;
            }
            if(zeroes<=k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
        }
        System.out.println(maxlen);
    }
}
