package annotation;

import java.lang.reflect.*;

public class tannot {
	
	
	
	@Annot2
	public String firstName;
 
    @Annot2
    public String lastName;
 
    @Annot2
    public String age;
 
    public String address;
 
    tannot(String fname,String lname, String age, String add){
    	this.firstName=fname;
    	this.lastName=lname;
    	this.age=age;
    	this.address=add;
		
	}
    @Annot
    private void initNames() {
        System.out.println("inside init");
    }

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException {
		two t = new two();
		Method m =t.getClass().getMethod("func1");
		t.func1();
		Annot an =m.getAnnotation(Annot.class);
		System.out.println(an.key());
		
		

	}

}
