
package overloading;


public class Overloading {

 /*   static int max(int m,int n){
        return m>n?m:n;
    }
    static float max(float m,float n){
        return m>n?m:n;
    }
    static int max(int m,int n,int o){
        return m>n && n>o ? m :(n>o?n:o);
    }*/
    
    
    static int [] reverse(int A[])
    {
        int B[]=new int[A.length];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        
        return B;
    }
    
    
    public static void main(String[] args) {
//        System.out.println(max(10.7f,5.5f));

            int A[]={1,2,3,4,5,6,7,8,9};
            System.out.println(reverse(A));
    }
    
}
