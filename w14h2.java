import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class w14h2 {
    public static void main(String[] args) throws IOException {
        // 創建 BufferedReader 物件來讀取輸入
        BufferedReader buf;
        String str;

        buf = new BufferedReader(new InputStreamReader(System.in));

        // 提示使用者輸入字串
        System.out.print("請輸入一個字串: ");
        // 讀取使用者輸入的字串
        str = buf.readLine();

        // 將字串轉換為大寫
        String upperCaseStr = str.toUpperCase();

        // 印出轉換後的字串
        System.out.println("大寫字串: " + upperCaseStr);
    }
}
