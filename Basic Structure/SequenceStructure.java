public class SequenceStructure
{
	public static void main(String[] args)
	{
		//part a
		//f(x)=5x^2+7x-3
		int x = 7;
		int ans;
		ans = 5 * x * x;
		ans += 7 * x;
		ans -= 3;
		System.out.println(ans);

		//part b
		//solution for quadratic equation
		int a = 1; //alternatively other constant
		int b = 3;
		int c = 2;
		double solutionOne = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		double solutionTwo = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.println(solutionOne + " " + solutionTwo);
	}
}
