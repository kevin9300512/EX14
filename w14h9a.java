import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 這個程式示範如何讀取兩個文字檔案的內容並印出。
 */
public class w14h9a {
    public static void main(String[] args) {
        // 指定兩個檔案的名稱
        String file1Name = "aaa.txt";
        String file2Name = "bbb.txt";

        // 讀取並印出第一個檔案的內容
        System.out.println("內容來自 " + file1Name + ":");
        readFileContents(file1Name);

        System.out.println();  // 加入空行

        // 讀取並印出第二個檔案的內容
        System.out.println("內容來自 " + file2Name + ":");
        readFileContents(file2Name);
    }

    /**
     * 讀取檔案內容並印出每一行。
     *
     * @param fileName 檔案名稱
     */
    private static void readFileContents(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // 逐行讀取檔案內容
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // 處理例外，印出堆疊追蹤以協助偵錯
            e.printStackTrace();
        }
    }
}
