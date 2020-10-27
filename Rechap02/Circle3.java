//なぜかエラーがでる。ファイルの先頭にエラーが表示されているが、コメントアウトなしでも変わらず。。。
//初期化したらできた！！！　　　なぜできたかは不明、一回のランで成功しない。


import java.util.Scanner;

class Circle3 {
	public static void main(String[] args) {
		final double PI = 3.1416;		//円周率
		Scanner stdIn = new Scanner(System.in);

		System.out.print("半径：");
		double r = stdIn.nextDouble();	//半径
		
		System.out.println("円周率の長さは" + 2 * PI * r + "です。");
		System.out.println("面積は" + PI * r * r + "です。");
	}
}