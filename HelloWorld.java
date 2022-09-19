// program for shifting in array

class HelloWorld {
    public static int min_value(int[] a){
        int min_val = a[0];
        for(int i1=0;i1<a.length-1;i1++){
            if(min_val>=a[i1+1]){
                min_val = a[i1+1];
            }
        }
        return min_val;
    }
    
    public static int max_value(int[] a){
        int max_val = a[0];
        for(int i2=0;i2<a.length-1;i2++){
            if(max_val<=a[i2+1]){
                max_val = a[i2+1];
            }
        }
        return max_val;
    } 
    public static void main(String[] args) {
        int[] arr= {-1,1,0,-23,-45,78};
        // System.out.println(HelloWorld.max_value(arr));
        int min_value_index=0,max_value_index=0,temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==HelloWorld.min_value(arr)){
                min_value_index = i;
                
            }
        }
        // System.out.println(min_value_index);
        for(int j=0;j<arr.length;j++){
                
            if(arr[j]==HelloWorld.max_value(arr)){
                max_value_index = j;
                
                
            }
        }
        
        temp = arr[min_value_index];
        arr[min_value_index] = arr[max_value_index];
        arr[max_value_index]  =  temp;
        System.out.println();
        for(int k = 0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}