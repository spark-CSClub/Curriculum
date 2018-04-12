public class BranchStructure
{
	public static void main(String[] args)
	{
		//part a
		//whether a given number is even
		int a = (int) (Math.random() * 100);
		if (a % 2 == 0)
			System.out.println("even");
		else System.out.println("odd");

		//part b
		//whether a given number is multiples of both 2 and 3
		int b = (int) (Math.random() * 10000);
		if (b % 2 == 0)
			if (b % 3 == 0)
				System.out.println("Yes");
			else System.out.println("No");

		//part c
		//whether a given number is multiples of either 2 or 3
		int c = (int) (Math.random() * 10000);
		if (c % 2 == 0)
			System.out.println("Yes");
		else if (c % 3 == 0)
			System.out.println("Yes");
		else System.out.println("No");

		//part d
		//alternative implement of part b
		if (b % 2 == 0 && b % 3 == 0)
			System.out.println("Yes");
		else System.out.println("No");

		//part e
		//alternative implement of part c
		if (b % 2 == 0 || b % 3 == 0)
			System.out.println("Yes");
		else System.out.println("No");

		//part f
		//comparison among three numbers
		if (a >= b && b >= c)
			System.out.println(a);
		else if (b >= a && a >= c)
			System.out.println(b);
		else System.out.println(c);

		//part g
		double x = Math.random() * 2;
		double y = x >= 1 ? x + 1 : x - 3;
		System.out.println(y);

		if (x >= 1)
			y = x + 1;
		else y = x - 3;
		System.out.println(y);//alternative implement
	}
}
