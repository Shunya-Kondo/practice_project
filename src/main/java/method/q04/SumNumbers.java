package method.q04;

public class SumNumbers {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num1 = 3;
		int num2 = 2;
		int sum = calculateSum(num1, num2);
		System.out.println("第一引数:" + num1);
		System.out.println("第二引数:" + num2);
		System.out.println("加算結果:" + sum);
	}

	public static int calculateSum(int num1, int num2) {
		int calculateSum = num1 + num2;
		return calculateSum;
	}
}