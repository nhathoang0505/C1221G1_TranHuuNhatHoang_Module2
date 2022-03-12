package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFiles {
    public static List<String> readFiles(String filePath) {
        List<String> string = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                string.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }

    private static void write(List<String> stringList, String pathFile, Boolean append) {

        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFiles("src\\ss16_io_text_file\\bai_tap\\copy_file_text\\SourceForCopying.txt");
        write(readFiles("src\\ss16_io_text_file\\bai_tap\\copy_file_text\\SourceForCopying.txt"), "src\\ss16_io_text_file\\bai_tap\\copy_file_text\\TargetFile.txt", true);
    }
}

