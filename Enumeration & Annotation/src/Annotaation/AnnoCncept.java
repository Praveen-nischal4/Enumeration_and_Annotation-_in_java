package Annotaation;

class Fruits 
{
	protected String name;
	protected String taste;
	
	Fruits(String nm,String t)
	{
		this.name=nm;
		this.taste =t;
		
	}
	public void Detail()
	{
	System.out.println("This is fruit");
	}
}

class Mango extends Fruits
{
	double price;
	
	Mango(String nm,String t,double p)
	{
		super(nm,t);
		this.price=p;
	}
	
	@Override
	public void Detail()
	{
		System.out.println("This is a fruit");
		System.out.println(" Taste :"+taste);
	}
}

public class AnnoCncept {

	public static void main(String[] args) {

Mango m = new Mango("Mango","Sweet",65.72);
 m.Detail();
	}

}
