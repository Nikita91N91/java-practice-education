package com.dmdev.inputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReaderRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "text.txt");
        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }
    }
}
