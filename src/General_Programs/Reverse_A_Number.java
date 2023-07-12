package General_Programs;

import java.util.Scanner;

public class Reverse_A_Number {
	public static void main(String[] args) {
		
		pallindromeCheck(102);
	}
		public static void pallindromeCheck(int num)
		{
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if (num==rev)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("N0t Pallindrome");
		}
	
		// or Reverse a number from String Buffer
		
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev1 = sb.reverse();
		System.out.println(rev1);
		
	}

}
