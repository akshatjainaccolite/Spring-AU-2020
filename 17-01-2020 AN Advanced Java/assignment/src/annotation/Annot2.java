package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.FIELD)
public @interface Annot2 {
	public String key() default "Aksh"; 
}

class one{
	@Annot2(key="jai")
	String firstName="akshat";
}
