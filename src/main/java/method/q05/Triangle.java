package method.q05;

public class Triangle {

	public static void main(String[] args) {
		int btom = 8;
		int height =5;
		int sum =getTriangleArea(btom,height);
		System.out.println("底辺:"+ btom);
		System.out.println("高さ:"+ height);
		System.out.println("三角の面積:"+ sum);
	}

	public static int getTriangleArea(int btom, int height) {
		return btom * height / 2;

	}
}
