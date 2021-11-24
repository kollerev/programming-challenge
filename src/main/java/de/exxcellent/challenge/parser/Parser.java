package de.exxcellent.challenge.parser;

import java.util.List;

public interface Parser {
    List<List<String>> readFile(String filePath);
}
