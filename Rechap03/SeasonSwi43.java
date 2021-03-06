// list 3C-1 switch式→switch文とは違うのだよ

import java.util.Scanner;

class SeasonSwi43 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("季節を求めます。\n何月ですか：");
        int month = stdIn.nextInt();

        String season = switch (month) {
            case 3,4,5      -> "春";
            case 6,7,8      -> "夏";
            case 9,10,11    -> "秋";
            case 12,1,2     -> "冬";
            default         -> "不明";
        };
        System.out.println("季節は" + season + "デス。");
    }
}
