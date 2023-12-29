import java.io.FileReader;
import java.io.IOException;

public class w14h4 {
    public static void main(String[] args) {
        String fileName = "donkey.txt";

        try (FileReader fileReader = new FileReader(fileName)) {
            // 讀取字元數
            int charCount = 0;
            int data;
            
            // 讀取檔案內容
            while ((data = fileReader.read()) != -1) {
                // 印出每個字元
                System.out.print((char) data);
                charCount++;
            }

            // 列印檔案名稱和字元數
            System.out.println("\n檔案名稱: " + fileName);
            System.out.println("讀取的字元數: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
