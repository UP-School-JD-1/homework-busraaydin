package hwch4operators;

public class Operators {

	public static void main(String[] args) {

		Operators number = new Operators();
		
		number.multiple(0);
		number.busra();
		number.conditions();
		number.ternaryOperator();

	}
	
	int number1 = 32;
	int number2 = 47;
	int number3;
	
	public void multiple(int newNumber) {
		
		
		
		newNumber = number1 + number2;
		number3 += newNumber;
		
		
		System.out.println(number1);
		System.out.println(number2);

		System.out.println("New number: " + number3);
		
	}
	
	public void busra() {
		
		int number4 = ++number3;
		System.out.println(number4);
	}
	
	
	
	public void conditions() {
	
		int i = 6;
		int j = 20;
		
		if(i + j > 30) {
			System.out.println("i + j > 30");
		}else {
			System.out.println("i + j < 30");
		}
	
	}
	
	public void ternaryOperator() {
		
		int i = 6;
		int j = 20;
		boolean b;
		
		if( i + j > 30 ? true : false)
			System.out.println("with ternary: " + i + " + " + j + " > 30");
		else
			System.out.println("with ternary: " + i + " + " + j + " < 30");
	}


}