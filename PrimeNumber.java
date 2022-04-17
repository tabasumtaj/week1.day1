package week1.day1.primeNumber;

public class PrimeNumber {
	public static void main(String[] args)
	{
		int inputValue = 13;
		boolean isPrime = false;
		for (int i = 2; i <= inputValue/2; i++) {
			if (inputValue%i == 0) {
				isPrime = true;
				break;
			}
		}
		if(!isPrime){
			System.out.println(inputValue+ "Prime Number");
		}
		else
		{
			System.out.println(inputValue+ "Not Prime number");
		}

	}
}
