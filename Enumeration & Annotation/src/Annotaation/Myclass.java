package Annotaation;
import java.lang.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingle
{
	int value() default 1;
}

class Demo
{
	@MySingle(value=100)
	public void myMethod()
	{
		System.out.println("Hello");
	}

}
public class Myclass {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

     Demo d = new Demo();
     Method m = d.getClass().getMethod("myMethod");
	
     MySingle anno = m.getAnnotation(MySingle.class);
     System.out.println(anno.value());
		
	}

}
