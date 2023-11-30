package _06_05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import _06_03.end.BufferedReaderExample;

public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        String firstLine = "";
        try (BufferedReader reader = new BufferedReader( new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))){

            System.out.println("First line of the file");
            firstLine =  reader.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return firstLine;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {

        String wholeFile = "";
        try (BufferedReader reader = new BufferedReader(new  FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))){
            System.out.println("Whole file: ");
            StringBuilder stringBuilder = new StringBuilder();
            reader.lines().forEach(stringBuilder::append);

            wholeFile = stringBuilder.toString();
            System.out.println(wholeFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wholeFile;
    }

}
