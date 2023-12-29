import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *使用 FileWriter 類別將字串 "Welcome" 附加到現有文字檔案 'hello.txt' 的末尾。
 */
public class w14h7 {
    public static void main(String[] args) {
        String fileName = "hello.txt";
        String newText = "Welcome";

        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            // 使用 FileWriter 並指定 true，以開啟附加模式，將新的文字附加到檔案末尾。
            fileWriter.write(newText);
            System.out.println("成功附加文字到檔案: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 開啟檔案並印出完整內容，確認新文字已經附加。
        printFileContents(fileName);
    }

    private static void printFileContents(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("完整檔案內容:");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
