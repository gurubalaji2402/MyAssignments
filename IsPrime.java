package week1.day2;

import java.util.Scanner;

public class IsPrime {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number u want = ");
		int n=sc.nextInt();
		
		boolean flag =true;
		
		if (n<=1) {
			//0 and 1 ore not prime so we set flag as false
			flag=false;
		}
		else {
			//here we iterating from 2 to n number to find prime
			for (int i = 2; i < n/2; i++) {
				if(n%i==0) {
			//if it divisible and rem is 0 its not prime
			//flag it as false
		    //we find even one factor, the number is already not prime so break the loop
					flag=false;
					break;
				}
			}
		}
		//if flag is still true
		if(flag) {
			System.out.println("prime");
		}
		//else flag is false
		else {
			System.out.println("not a prime");
		}
		
	}
}
