package Enumeration;

enum Planet
{
	Mercury(57910,3.30e23),Venus(48526,4.82e24),Earth(149600,5.98e24);
	
	private long distance;
	private double mass;
	
	Planet(long d,double m)
	{
		this.distance=d;
		this.mass=m;
	}
	
	long getDistance()
	{
		return distance;
	}
	
	double getMass()
	{
		return mass;
	}
}
public class DisplayEnum {

	public static void main(String[] args) {

    System.out.println("Planet"+"\t\t"+"Distance(km)"+"\t"+"Mass(Kg)");
    
    Planet []allPlanet = Planet.values();
    {
    	for(Planet p :allPlanet)
    	{
    		System.out.print(p+"\t\t");
    		System.out.print(p.getDistance()+"\t\t");
    		System.out.print(p.getMass()+"\n");
    	}
    }
    
    
	}

}
