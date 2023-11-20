package home_practice;

public class Star {


	public void print()
	{
		for(int i = 0 ; i<5 ; i++)

		{
			System.out.println("*");
		


		for (int j = 0 ; j<=i ; j++) {

			System.out.print("*");

		}
		}
	}

public void tringle(int n)
{
	for(int i = 0; i<=n;i++)
	
	{
		
		for(int j = n-i; j >1;j--)
		{
			System.out.print(" ");
		}
		
		for(int j = 0 ; j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	
	}
}









public static void main(String[] args) {
	// TODO Auto-generated method stub


	Star s = new Star();
//	s.print();
	s.tringle(5);

}

}
