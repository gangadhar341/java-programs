import java .lang.*;
import java.util.*;

class Swap{
	public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers Those You Are Want To Swap:");
		a=sc.nextInt();
		b=sc.nextInt();

		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println("After Swapping :"+a +" " +b);
		


}


}