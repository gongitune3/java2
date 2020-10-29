//list 3-11 条件演算子

import java.util.Scanner;

class Min43w2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");    int a = stdIn.nextInt();
        System.out.print("整数b：");    int b = stdIn.nextInt();

        int min = a < b ? a :b;
        System.out.println("小さいのは" + min + "です。");

        //System.out.println("小さいのは" + (a < b ? a :b) + "です。");
    }
}


// x ? y : z xがtrueであればyを評価した値を、そうでなければzを評価した値を生成。