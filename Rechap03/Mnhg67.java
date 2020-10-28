//テスト

import java.util.Scanner;


class Mnhg67 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");	int a = stdIn.nextInt();
		System.out.print("整数b：");	int b = stdIn.nextInt();

		System.out.println("それらの差は" + (a < b ? b - a : a -b) + "です。");

	}
}
