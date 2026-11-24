package task10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {

        try (FileReader reader = new FileReader("Lab_10/Task_10/src/task10/studentsEN.txt", StandardCharsets.UTF_16);
             FileWriter writer = new FileWriter("Lab_10/Task_10/src/task10/studentsGrade5.txt")) {

            StringBuilder line = new StringBuilder();
            int character;

            while ((character = reader.read()) != -1) {
                if (character == '\n') {
                    writeIfGradeFive(line.toString().trim(), writer);
                    line.setLength(0);
                } else {
                    line.append((char) character);
                }
            }
            writeIfGradeFive(line.toString().trim(), writer);
        }
    }

    private static void writeIfGradeFive(String line, FileWriter writer) throws IOException {
        String[] fields = line.split("\t");
        if (fields[fields.length - 1].equals("5")) {
            writer.write(line + "\n");
        }
    }
}
