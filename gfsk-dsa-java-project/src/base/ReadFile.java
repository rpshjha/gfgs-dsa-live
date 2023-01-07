package base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    private static final String BASE_FILE_PATH = "./testdata/";

    public static List<String> readTextFile(String fileName) {
        File file = new File(BASE_FILE_PATH + fileName);
        List<String> inputLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null)
                inputLines.add(line);
        } catch (IOException e) {
            throw new RuntimeException("File not found at " + BASE_FILE_PATH + fileName + " !!");
        }

        return inputLines;
    }


    public static void main(String[] args) {
        System.out.println(ReadFile.readTextFile("fileInput.txt"));
    }
}
