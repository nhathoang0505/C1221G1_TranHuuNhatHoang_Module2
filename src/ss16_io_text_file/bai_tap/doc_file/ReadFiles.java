package ss16_io_text_file.bai_tap.doc_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles {
    public static final String SOURCE = "src\\ss16_io_text_file\\bai_tap\\doc_file\\abc.csv";

    public static List<Country> readFiles(String filePath) {
        List<Country> countries = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Country country = new Country(Integer.parseInt(arr[0]), arr[1], arr[2]);
                countries.add(country);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }

    public static void print(List<Country> countries) {
        for (Country e : countries) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        print(readFiles(SOURCE));
    }
}

