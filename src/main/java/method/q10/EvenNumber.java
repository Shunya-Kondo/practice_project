package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		int numArray[] = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		int evenCount = getEvenNumbers(numArray);
		System.out.println(Arrays.toString(numArray) + "には、偶数が" + evenCount + "個あります。");
	}
	public static int getEvenNumbers(int[] numArray) {
		int count = 0;
		for (int num : numArray) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}