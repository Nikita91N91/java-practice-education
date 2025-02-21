package com.dmdev.inputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
//        File file = Path.of("resources", "writer.txt").toFile();
//        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
//            fileWriter.append("Hello World!");
//            fileWriter.newLine();
//            fileWriter.append("Java");
//        }

        Path path = Path.of("resources", "writer2.txt");

        Files.write(path, List.of("Hello World!", "Java"));

//        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
//            writer.append("Hello World");
//            writer.newLine();
//            writer.append("Java");
//        }
    }
}
