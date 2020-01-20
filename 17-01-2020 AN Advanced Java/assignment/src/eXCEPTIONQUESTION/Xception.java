package eXCEPTIONQUESTION;
import java.util.Scanner;
public class Xception{

	private static void proc(float num1, float num2, Divide divider) {
		divider.divide(num1, num2);
	}
	public static interface Divide{
		public void divide(float numerator, float denominator);
	}
	public static void main(String[] args) {
		
		float num1 = 0, num2 = 0;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("First No :");
			num1 = s.nextFloat();
			System.out.println("Second No :");
			num2 = s.nextFloat();
		}
		catch(Exception e) {
			System.out.println("Divide BY zero Exception");
		}
		proc(num1, num2, divideWrapper((num_1, num_2) -> System.out.println(num_1/num_2)));
	}

private static Divide divideWrapper(Divide dividelambda) {
	return (num1,num2) -> {
		try {
			if(num2 == 0 )
				throw new ArithmeticException();
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e) {
			System.out.println("Can't Divide by Zero.");
		}
	};
}
}
