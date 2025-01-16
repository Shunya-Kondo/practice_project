package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		int leftNum = 5;
		double rightNum = 3.3;
		int sum = calculateSum(leftNum, rightNum);
		System.out.println("第一引数（整数）：" + leftNum);
		System.out.println("第二引数（実数）：" + rightNum);
		System.out.println("加算結果：" + sum);
	}

	public static int calculateSum(int leftNum, double rightNum) {
		return (int) (leftNum + rightNum);
	}
}
