
@FunctionalInterface 
interface Triconsumer<T, U, V> {
    void accept(T t1, U t2, V t3);
}

public class tconsumer {

	public static void main(String args[]) {
		Triconsumer<Integer, Integer, Integer> t =(t1,t2,t3) -> System.out.println(t1*t2*t3); 
	     t.accept(5, 10, 15);

}
}


