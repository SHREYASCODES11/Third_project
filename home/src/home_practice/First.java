package home_practice;

public class First {

	static String a = "shreyas";
	static	String b = "";

	public void reverse(int length) {
		for(int i =length-1; i>=0;i--)
		{
			b = b + a.charAt(i);
		}
		System.out.println(b);



	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f = new First();
		System.out.println(a);
		int length =a.length();
		System.out.println(length);
		f.reverse(length);
	}

}
