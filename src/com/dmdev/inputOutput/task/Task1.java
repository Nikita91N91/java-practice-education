package com.dmdev.inputOutput.task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task1 {
    private static final String VOWELS = "уёэоаыиюя";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "text.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstSymbol = word.charAt(0);
                if (VOWELS.indexOf(firstSymbol) != -1){
                    System.out.println(word);
                }

            }
        }
    }
}
