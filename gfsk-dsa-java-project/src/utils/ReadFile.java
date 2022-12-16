package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFile {

    static final String filePath = "./testdata/";

    public static List<String> readTextFile(String fileName) {
        File file = new File(filePath + fileName);
        List<String> inputLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null)
                inputLines.add(line);
        } catch (IOException e) {
            System.err.println("File not found!!");
            return Collections.emptyList();
        }

        return inputLines;
    }


    public static void main(String[] args) {
        System.out.println(ReadFile.readTextFile("fileInput.txt"));
    }
}
