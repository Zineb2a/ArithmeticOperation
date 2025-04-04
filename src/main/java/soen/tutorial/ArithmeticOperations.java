package soen.tutorial;

public class ArithmeticOperations {

	public int divide(int a, int b) {
    return a / b;
}


	public Integer addOrSub(Integer a, Integer b)
	{
		if (a > b) {
			return a - b;
		} else {
			return a + b;
		}
	}
}
