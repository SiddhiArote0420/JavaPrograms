/*Write a Java program using the I/O Decorator pattern that reads text from a file and 
converts all uppercase letters to lowercase letters before displaying or saving the 
output. */


/*import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;*/

import java.io.*;

class LowerCaseReader extends FilterReader {
    public LowerCaseReader(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1) ? -1 : Character.toLowerCase((char) c);
    }
}

public class LowerCaseReaderDemo {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Pratik Pol\\Desktop\\Lowercasedemo\\Text.txt";
        String outputFile = "C:\\Users\\Pratik Pol\\Desktop\\Lowercasedemo\\lowercase.txt";

        try (Reader fileReader = new FileReader(inputFile);
             Reader lowerCaseReader = new LowerCaseReader(fileReader);
             FileWriter fileWriter = new FileWriter(outputFile)) {

            int character;
            while ((character = lowerCaseReader.read()) != -1) {
                fileWriter.write((char) character);
            }

            System.out.println("Conversion complete! Check: " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}