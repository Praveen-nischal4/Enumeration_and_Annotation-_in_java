package Enumeration;

enum Color
{
	Red,Green,Blue,Yellow,Black             //declaring color enumeration
}

public class ColorTest {
	
	Color c;                 // instance variable of color 'c'
	
	ColorTest(Color c)
	{
		this.c=c;
	}
	
	public void DisplayColor()
	{
		switch(c)
		{
		case Red:
			System.out.println("Your choosen color is Cool");
			break;
		case Green :
			System.out.println("Your choosen color is Magnificient");
			break;
		case Blue :
			System.out.println("Your choosen color is SkyBlue");
			break;
		case Yellow :
			System.out.println("Your choosen color is Warm");
			break;
		case Black :
			System.out.println("Your choosen color is King of Colors");
			break;
			default:
				System.out.println("Your color choice is Absured");			
				break;
		}
	}

	public static void main(String[] args) {

		ColorTest ct = new ColorTest(Color.Black);
		ct.DisplayColor();
		
	}

	

}
