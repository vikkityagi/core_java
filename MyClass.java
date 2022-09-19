public class MyClass {
    static void rightTrange(int n){
        String pat = "x";
        int j = n;
        String spec = " ";
        for(int i=1;i<=n;i++){
            if(j-i>=1){
                System.out.print(spec.repeat(j-i));
                
            }
            System.out.print(pat.repeat(i));
            System.out.println();
        }
    }
    
    static void leftTrangle(int n){
        String pat = "x";
        int j = n;
        String spec = " ";
        for(int i=1;i<=n;i++){
            System.out.print(pat.repeat(i));
            if(j-i>0){
                System.out.println(spec.repeat(j-i));
            }
        }
    }
    public static void main(String args[]) {
        MyClass.leftTrangle(5);
        System.out.println();
        MyClass.rightTrange(5);
  
    }
}