package gcd;

import java.util.Scanner;
public class GCD {
    
    static int isGcd(int x,int y){
        
       while(x!=y){
           if(x>y)x=x-y;
           else y=y-x;
        }
       return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers to perform GCD:");
        int m=sc.nextInt();
        int n= sc.nextInt();
        System.out.println("GCD is "+isGcd(m,n));
    }
    
}
