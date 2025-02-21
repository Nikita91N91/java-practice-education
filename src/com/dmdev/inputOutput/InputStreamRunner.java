package com.dmdev.inputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {

    public static void main(String[] args) throws IOException {

        //  File file = new File(String.join(File.separator,"resources,text.txt"));
        File file = Path.of("resources", "text.txt").toFile();

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[fileInputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) fileInputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String string = new String(bytes);
            System.out.println(string);


//            byte[] bytes = fileInputStream.readAllBytes();
//            String string = new String(bytes);
//            System.out.println(string);
        }
    }
}
