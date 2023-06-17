package String;

public class ReverseAString {
	public static void main(String[] args) {
		
		String name="madam";
		System.out.println(name);
		
		String reverse_name="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse_name=reverse_name+name.charAt(i);
		}
		System.out.println(reverse_name);
		
		if (reverse_name.equals(reverse_name))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}

}
