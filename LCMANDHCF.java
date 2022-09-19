// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LCMANDHCF {
    static boolean isPrime(int n){
        boolean ans = true;
        if(n>3){
          for(int i=2;i<=n/2;i++){
            if(n%i==0){
                ans = false;
            }
          }  
        }
    return ans;   
    }
    static int hcf(int a,int b){
        if(b%a==0){
            return a;
        }else{
            b = b%a;
        }
    return hcf(b,a);
    }
    
    static int hcfCheck(int[] a){
      int res = a[0];
      for(int i=0;i<a.length;i++){
          
          res = LCMANDHCF.hcf(res,a[i]);
          System.out.println(res);
          if(res == 1){
              return 1;
          }
      }  
      return res;  
    }
    
    static int lcmcheck(int a, int b,int h){
        int lcm = 0;
        return (a*b)/h;
    }
    
    static int alllcmcheck(int[] a){
        int div = 2;
        int lcm = 1;
        while(true){
            int check = 0; // for terminate
            int count = 0;  // for divisor
            for(int i=0;i<a.length;i++){
                if(a[i]==1){
                    count++;
                    check++;
                }else{
                    if(a[i]%div==0){
                        a[i] = a[i]/div;
                    }else{
                        count++;
                    }
                }
            }
            if(check==a.length){
                break;
            }
            if(count==a.length){
                div++;
            }
            else{
                lcm = lcm * div;
            }
        }
        return lcm;
    }
    public static void main(String[] args) {
        
        
        int[] arr= {2,4,6};
        System.out.println("HCF : "+LCMANDHCF.hcfCheck(arr));
        System.out.println("LCM : "+LCMANDHCF.alllcmcheck(arr));
    }
}