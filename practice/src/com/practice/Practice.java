package com.practice;
import java.util.Arrays;
import java.util.Scanner;



public class Practice {
	public static void main(String[] args) {
		int n, pos, x;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n+1];
        System.out.print("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
       
        System.out.print("Enter the position where you want to insert element:");
        pos = s.nextInt();
        
        System.out.print("Enter the element you want to insert:");
        x = s.nextInt();
        
        //inserting the element
        for(int i = (n-1); i >= (pos); i--)
        {
            a[i+1] = a[i];
        }
        a[pos] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
//        s.close();

    }

	
}
