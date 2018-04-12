import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests
{
	@Test
	public void testLargerPrime()
	{
		int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
		for (int i = 0; i < 100; i++)
		{
			int n = (int) (Math.random() * prime.length) * (int) (Math.random() * prime.length);
			for (int j = n - 1; j > 0; j--)
				if (n % j == 0)
				{
					assertEquals(j, Practice.largerPrime(n));
					break;
				}
		}
	}

	@Test
	public void testReverseThreeDigitNumber()
	{
		for (int i = 0; i < 100; i++)
		{
			int n = (int) (Math.random() * 900 + 100);
			StringBuilder sb = new StringBuilder();
			sb.append(n);
			sb.reverse();
			int reversed = Integer.parseInt(sb.toString());
			assertEquals(reversed, Practice.reverseThreeDigitNumber(n));
		}
	}

	@Test
	public void testPostage()
	{
		assertEquals(8, Practice.postage(999, false));
		assertEquals(12, Practice.postage(1001, false));
		assertEquals(12, Practice.postage(1499, false));
		assertEquals(12, Practice.postage(1500, false));
		assertEquals(16, Practice.postage(1501, false));
		assertEquals(16, Practice.postage(2000, false));
		assertEquals(20, Practice.postage(2001, false));
		for (int i = 0; i < 100; i++)
		{
			int weight = (int) (Math.random() * 10000) + 1;
			boolean isUrgent = Math.random() > 0.5;
			int money = isUrgent ? 5 + 8 : 8;
			if (weight > 1000)
				if (weight % 500 != 0)
					money += 4 * ((weight - 1000) / 500 + 1);
				else
					money += 4 * (weight - 1000) / 500;
			assertEquals(money, Practice.postage(weight, isUrgent));
		}
	}
}
