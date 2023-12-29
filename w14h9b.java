import java.io.*;

/**
 * 這個程式示範如何讀取兩個文字檔案的內容，將它們合併並儲存到新的文字檔案 'ccc.txt'。
 */
public class w14h9b {
    public static void main(String[] args) {
        // 指定兩個檔案的名稱
        String file1Name = "aaa.txt";
        String file2Name = "bbb.txt";
        // 新檔案的名稱
        String mergedFileName = "ccc.txt";

        // 讀取兩個檔案的內容
        String file1Content = readFileContents(file1Name);
        String file2Content = readFileContents(file2Name);

        // 合併內容
        String mergedContent = file1Content + "\n" + file2Content;

        // 儲存合併後的內容到新檔案 'ccc.txt'
        writeToFile(mergedFileName, mergedContent);

        System.out.println("成功將兩個檔案合併並儲存為 " + mergedFileName);
    }

    /**
     * 讀取檔案內容並返回字串。
     *
     * @param fileName 檔案名稱
     * @return 檔案內容的字串表示
     */
    private static String readFileContents(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // 逐行讀取檔案內容
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    /**
     * 將字串內容寫入檔案。
     *
     * @param fileName 檔案名稱
     * @param content  要寫入檔案的內容
     */
    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            // 寫入內容到檔案
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

