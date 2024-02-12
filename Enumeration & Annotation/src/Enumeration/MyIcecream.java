package Enumeration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum Icecream
{
	Vanilla(20), strawberry(25), Pista(65),Choclate(35);
	
	private double price;
	
	Icecream(double p)
	{
		this.price=p;
	}
	
	public static void getPrice(int i)
	{
		Icecream []allIcecream =Icecream.values();
		System.out.println("Pay Rs."+allIcecream[i].price);
	}
}
public class MyIcecream {

	public static void main(String[] args) throws NumberFormatException, IOException {
    
		//display all icecream
		System.out.println("AVAILABLE ICECREAMS");
		Icecream allicecream[] = Icecream.values();
		for(Icecream ice :allicecream)
		{
			int no = ice.ordinal();
			System.out.println(no+" "+ice);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your choice");
		int choice =Integer.parseInt(br.readLine());
		Icecream.getPrice(choice);
    
	}

}
