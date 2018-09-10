package com.sidenis.robots;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RobotFileReader {
    public void readFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        String everything = sb.toString();

    }
}
