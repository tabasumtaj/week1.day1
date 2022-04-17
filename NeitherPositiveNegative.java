package week1.day1.primeNumber;

public class NeitherPositiveNegative {

	public static void main(String[] args)
	{
		int number = 35;
		if(number > 0){
			System.out.println("The number is positive");
		}
		int newNumber = number * (-1);
		if(newNumber <0 ){
			System.out.println(newNumber+ "the number is negative");
		}
		int newNeither =  number % newNumber;
		if(newNeither == 0){
			System.out.println(newNeither+ "the number is neither positive nor negative");
		}
	}
}
