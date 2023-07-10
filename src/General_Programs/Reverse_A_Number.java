package General_Programs;

import java.util.Scanner;

public class Reverse_A_Number {
	public static void main(String[] args) {
		
		pallindromeCheck(102);
	}
		public static void pallindromeCheck(int givenNumber)
		{
		
		int reverseNumber=0;
		
//		while(givenNumber!=0)
//		{
//			int reminder=givenNumber%10;
//			reverseNumber=reverseNumber*10+reminder;
//			givenNumber=givenNumber/10;
//		}
//		System.out.println(reverseNumber);
//		if (givenNumber==reverseNumber)
//		{
//			System.out.println("Pallindrome");
//		}
//		else
//		{
//			System.out.println("N0t Pallindrome");
//		}
	
		// Reverse a number
		
		StringBuffer sb=new StringBuffer(String.valueOf(givenNumber));
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		
	}

}
