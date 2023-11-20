package home_practice;

public class Swap {

	String a = "shreyas";
	String b = "yash";
	String c = "";

	public void Swapping()
	{
		System.out.println("Before Swapping : ");
		System.out.println("a = "+a+" b = "+b+ " c = "+c);

		c = a;
		a = b;
		b = c;

		System.out.println("After Swapping : ");
		System.out.println("a = "+a+" b = "+b+ " c = "+c);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap s = new Swap();
		s.Swapping();
	}

}
