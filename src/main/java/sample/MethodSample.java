package sample;

public class MethodSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
       test();
       int result = plusNum(2,5);
       System.out.println(result);
	}
    //メソッドの定義
	//アクセス修飾子 戻り値の型 メソッド名(必要であれば引数)
	//戻り値なしの場合は戻り値の型はvoid
    public static void test() {
    	System.out.println("Hello");
    }
    public static int plusNum(int num1,int num2) {
    	return num1 + num2;
    }
}
