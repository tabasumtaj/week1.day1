package week1.day1.factorial;

public class Factorial {
	public static void main(String[] args)
	{
		int inputValue = 5;
		int factValue = 1;
		for (int i = 1; i <= inputValue; i++) {
			factValue =  factValue*i;	
		}
		System.out.println(inputValue+""+factValue);

	}
}
