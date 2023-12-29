import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用 FileWrite 類別將字元陣列 'hi' 寫入檔案。
 */
public class w14h6{
    public static void main(String[] args) {
        // 宣告一個字元陣列 'hi'
        char[] hi = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};
        
        // 指定檔案名稱
        String fileName = "output.txt";

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            // 使用 try-with-resources 以確保在完成時關閉檔案資源。

            // 將字元陣列 'hi' 寫入檔案。
            fileWriter.write(hi);
            
            //輸出成功寫入檔案的訊息。
            System.out.println("熱烈掌聲，成功寫入檔案: " + fileName);
        } catch (IOException e) {
            // 印出例外堆疊追蹤以協助偵錯。
            e.printStackTrace();
        }
    }
}
