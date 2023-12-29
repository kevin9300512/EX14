import java.io.*;

class Data {
    private String name;
    private int english;
    private int math;

    // 建立 Data 類別的建構子
    public Data(String str, int e, int m) {
        this.name = str;
        this.english = e;
        this.math = m;
    }

    // 寫入資料到 student.txt 檔案
    public static void writeData(Data stu1, Data stu2) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"))) {
            // 寫入 stu1 的資料
            writer.write(stu1.toString());
            writer.newLine();
            
            // 寫入 stu2 的資料
            writer.write(stu2.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 顯示所有成員、英文數學成績的平均
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("English Score: " + english);
        System.out.println("Math Score: " + math);
        System.out.println("Average Score: " + calculateAverage());
        System.out.println("---------------");
    }

    // 計算英文和數學成績的平均
    private double calculateAverage() {
        return (english + math) / 2.0;
    }

    // 覆寫 toString 方法，用於寫入資料到檔案
    @Override
    public String toString() {
        return name + "," + english + "," + math;
    }

    public static void main(String[] args) {
        // 建立兩位學生資料
        Data stu1 = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);

        // 寫入資料到 student.txt
        writeData(stu1, stu2);

        // 讀取資料並印出
        readDataAndShow();
    }

    // 讀取資料並印出
    private static void readDataAndShow() {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int english = Integer.parseInt(data[1]);
                int math = Integer.parseInt(data[2]);

                // 建立 Data 物件
                Data student = new Data(name, english, math);

                // 顯示學生資料
                student.show();
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
