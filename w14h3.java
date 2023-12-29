import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class w14h3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("請輸入整數 N：");
            // 讀取使用者輸入的整數
            int N = Integer.parseInt(reader.readLine());

            // 計算1到N的總和
            int sum = calculateSum(N);

            // 印出結果
            System.out.println("1到" + N + "的總和是：" + sum);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                // 關閉 BufferedReader
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 計算1到N的總和的方法
    private static int calculateSum(int N) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        return sum;
    }
}
