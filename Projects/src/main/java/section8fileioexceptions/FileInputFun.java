package section8fileioexceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInputFun {
    public static void main(String[] args) {
        // Note: Checked vs Unchecked exceptions
        // - Unchecked exceptions have in their ancestor hierarchy
        // a class names RuntimeException
        // - do not cause a compiler to refuse to compile if not acknowledge
        // Checked exceptions cause the compiler to check if they are being
        // handled in a try-catch or in some other ways referred to as re-throwing
        // the exception
        // Scanner is better for using if keyboard input is required other
        // BufferedReader
        // probably better

        // First get the input stream
        InputStream inputStream = FileInputFun.class
                .getResourceAsStream("input.txt");
        if (inputStream == null) {
            System.out.println("Error: Could not find input.txt in resources");
            System.out.println("Current working directory: "
                    + System.getProperty("user.dir"));
            return;
        }

        try (BufferedReader fileRead = new BufferedReader(
                new InputStreamReader(inputStream))) {
            int sum = 0;
            while (true) {
                String str = fileRead.readLine();
                if (str == null) {
                    break;
                }

                int strAsInt = Integer.parseInt(str);
                System.out.println(strAsInt);

                // Challenge: Sum the Numbers
                // calculate the sum of all the numbers in the file and print them
                sum += strAsInt;
            }
            System.out.println("Sum is " + sum);

            // Note: it is a syntax error to put a catch block for a more general
            // exception type before a catch block for a more specific type
        } catch (IOException e) {
            System.out.println("File I/O exception: " + e.getMessage());
        }
    } // end main
}
