package de.exxcellent.challenge.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVParser implements Parser {

    public static final String DELIMITER = ",";

    @Override
    public List<List<String>> readFile(String filePath) {
        List<List<String>> fileContent = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                fileContent.add(Arrays.asList(values));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }
}
