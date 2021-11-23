package hw9;

import com.sun.deploy.nativesandbox.NativeSandboxOutputStream;

import java.io.*;
import java.util.Scanner;

public class FileNumbers {

    private static NativeSandboxOutputStream writer;

    public static void createNumbersFile () throws Exception {

        try (Writer writer = new FileWriter("C://Java/numbers.txt")) {
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println("")) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = (int) (Math.random() * 99 + 1);
                    System.out.println(array[i][j] + " ");
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");

            }
        } catch (Exception e) {
            System.out.println("Ошибка записи в файл " + e);
        }

    }

    public static void createOddNumbersFile() throws IOException {
        try (Scanner in = new Scanner(new File("C://Java/numbers.txt"))) {
            PrintWriter pw = new PrintWriter(new File("C://Java/odd-numbers.txt"));
            System.out.println("Вывод чисел , с учетом замены целых четных чисел на '0':");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int ch = line.nextInt();
                    if (ch % 2 == 0) {
                        System.out.println("0");
                        ch = 0;
                    } else
                        System.out.println(ch + " ");
                    pw.println(ch + " ");
                }
                line.close();
                pw.println();
                pw.close();

            }
            System.out.println();
        } catch (IOException ioException) {
            System.out.println("Файл не записан" + ioException);
        }
    }
}