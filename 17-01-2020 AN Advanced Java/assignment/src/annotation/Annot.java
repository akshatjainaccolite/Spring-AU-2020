package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)
public @interface Annot {
	public String key() default "Akshat";  
	
}
class two{
	@Annot(key="jain")
	public void func1() {
		System.out.println("coming from annot1");
	}
}


