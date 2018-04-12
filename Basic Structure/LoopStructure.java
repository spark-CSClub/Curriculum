public class LoopStructure
{
	public static void main(String[] args)
	{
		//part a
		for (int i = 0; i < 10; i++)
			System.out.println(i);
		System.out.println();

		for (int i = 0; i < 10; i++)
			System.out.println("*");
		System.out.println();

		for (int i = 20; i >= 15; i--)
			System.out.println(i);
		System.out.println();

		for (int i = 2; i <= 10; i += 2)
			System.out.println(i);
		System.out.println();

		//part b
		//inverted sequence of a given number
		int num = (int) (Math.random() * 10000);
		System.out.println(num);
		while (num > 10)
		{
			System.out.print(num % 10);
			num /= 10;
		}
		System.out.println(num);
		System.out.println();

		//part c
		//smaller solution for equation x^2-15x+56=0
		for (int i = 0; i <= 10; i++)
			if (i * i - 15 * i + 56 == 0)
			{
				System.out.println(i);
				break;
			}
		System.out.println();

		//part d
		//non-prime number in [1,20]
		for (int i = 0; i <= 20; i++)
		{
			if (Library.isPrime(i))
				continue;
			System.out.println(i);
		}
		System.out.println();

		//part e
		//Project Euler Problem 1
		//see https://projecteuler.net/problem=1
		//If we list all the natural numbers below 10 that are multiples
		//of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		//Find the sum of all the multiples of 3 or 5 below 1000.
		int ans = 0;
		for (int i = 1; i < 1000; i++)
			if (i % 3 == 0 || i % 5 == 0)
				ans += i;
		System.out.println(ans);
	}
}
