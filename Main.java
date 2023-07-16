import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // コマンドライン引数の数が正しいかチェック
        if (args.length != 2) {
            System.out.println("引数が正しくありません。2つの数値を指定してください。");
            return;
        }

        // 引数を数値に変換
        double num1, num2;
        try {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("数値を正しく指定してください。");
            return;
        }

        // 足し算と割り算の結果を計算して表示
        double sum = num1 + num2;
        double quotient = num1 / num2;

        System.out.println("足し算の結果: " + sum);
        System.out.println("割り算の結果: " + quotient);
        // 引き算の結果を表示する。
        double difference = num1 - num2;
        System.out.println("引き算の結果: " + difference);
        // 四則演算の結果をリストに格納する
        List<Double> list = new ArrayList<Double>();
        list.add(sum);
        list.add(quotient);
        list.add(difference);
        // リストの中身を表示する
        for (Double double1 : list) {
            System.out.println(double1);
        }
    }
}
