//Second method for accessing values of Enumeration
package Enumeration;

enum Shapes
{
	Triangle,Rectangle,Circle,Square,Rhombus,Parallelogram,Sphere,Cone
}

public class MyShapes {

	public static void main(String[] args) {

      Shapes myShapes[] =Shapes.values();
      
      for(Shapes s :myShapes)
      {
    	  System.out.println(s);
      }

	}

}
