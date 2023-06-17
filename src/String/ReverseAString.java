package String;

public class ReverseAString {
	public static void main(String[] args) 
	{
		
		stringCheck("MADAM");
}
		
		
			
		public static void stringCheck(String name)
		{
		
		
		System.out.println(name);
		
		String reverse_name="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse_name=reverse_name+name.charAt(i);
		}
		System.out.println(reverse_name);
		
		if (reverse_name.equals(name))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
		
		
		
	}
	

}
