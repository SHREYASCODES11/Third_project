package home_practice;

public class Third {

	String a = "shreyas";
	String b = "patil";

	public void Swap()
	{
		System.out.println("before   " +"a : " +a +" , "+" b :"+b );
		a = a+b;
		
		b= a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("after   " +"a : " +a +" , "+" b :"+b );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third t = new Third();
		t.Swap();
	}

}
