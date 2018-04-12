import java.math.BigInteger;

public class Library
{
	public static boolean isPrime(int a)
	{
		if (a <= 1)
			return false;
		for (int i = 2; i * i <= a; i++)
			if (a % i == 0)
				return false;
		return true;
	}

	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		for (long i = 2; i * i <= a; i++)
			if (a % i == 0)
				return false;
		return true;
	}

	public static boolean isPrime(BigInteger a)
	{
		if (a.compareTo(BigInteger.ONE) <= 0)
			return false;
		for (BigInteger i = new BigInteger("2"); i.multiply(i).compareTo(a) <= 0; i = i.add(BigInteger.ONE))
			if (a.mod(i).equals(BigInteger.ZERO))
				return false;
		return true;
	}
}
