package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 13;

		switch (number) {
		case 12:
		case 1:
		case 2:
			System.out.println(number + "月は冬です。");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(number + "月は春です。");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(number + "月は夏です。");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(number + "月は秋です。");
			break;
		default:
			System.out.println(number + "月は存在しないです。");
		}
	}
}
