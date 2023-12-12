package linersearch;
import java.util.*;
public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc = new Scanner (System.in);
System.out.println("enter the search element");
int search = sc.nextInt();
System.out.println("enter the how many arry values are include");

int n = sc .nextInt();
System.out.println("enter the how many arry values are include");
int arr[] = new int [n];
System.out.println("Enter the search elements");
for (int i = 0; i<arr.length;i++) {
	arr[i]=sc.nextInt();
	
}
Linear l = new Linear ();
int result = l.display(arr,search);
if(result==-1) {
	System.out.println("the search element is not there");
}	
else
	System.out.println("the search element"+search+ "is in index"+result);
	}
	
	
	
	
	
	
	private int display(int[] arr, int search) {
		 int count = 0;
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==search) {
			
		return count;
		
		}
		else {
			count ++;
		}
		}
		return -1;
		
		
	}


	
}
	
